package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	private Scanner scan;
	private int time;
	
	public ResponsiveUI(){
		this.time = 0;
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args){
		ResponsiveUI UI = new ResponsiveUI();
		Thread t = new Thread(UI);
			t.start();
				
	}
	
	@Override
	public void run() {
		for(int i = 0; i <10; i++){
			ResponsiveUI UI = new ResponsiveUI();
			Thread t = new Thread(UI);
			time = getInput(i);
				try{
					t.sleep(time);
					System.out.println("Thread " + i + " ended.");
				} catch (InterruptedException ex){
						ex.printStackTrace();
				}
			}
		scan.close();
	}

	public int getInput(int i){
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		return input;
	}
}
