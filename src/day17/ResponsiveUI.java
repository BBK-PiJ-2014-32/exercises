package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	private ResponsiveUI r;
	private Scanner scan;
	private int time;
	
	public ResponsiveUI(int input){
		this.time = input;
	}
	
	public static void main(String[] args){
		for(int i = 0; i <10; i++){
			ResponsiveUI UI = new ResponsiveUI(getInput(i));
			Thread t = new Thread(UI);
			t.start();
				synchronized(t){
					try{
						t.wait();
					} catch (InterruptedException ex){
						ex.printStackTrace();
					}
				}
		}
	}
	
	@Override
	public void run() {
		
		
	}

	public static int getInput(int i){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		scan.close();
		return input;
	}
}
