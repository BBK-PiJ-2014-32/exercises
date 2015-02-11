package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	private ResponsiveUI r;
	private Scanner scan;
	private int time;
	
	public ResponsiveUI(){
		this.time = 0;
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
			int input = getInput(i);
				try{
					t.sleep(input);
					System.out.println("Thread " + i + " ended.");
				} catch (InterruptedException ex){
						ex.printStackTrace();
				}
			}
		scan.close();
	}

	public static int getInput(int i){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		return input;
	}
}
