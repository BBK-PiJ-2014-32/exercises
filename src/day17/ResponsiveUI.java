package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	private static Scanner scan;
	private static int time;
	private static int task;
	
	public ResponsiveUI(){
		this.time = 0;
		this.task = 0;
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			ResponsiveUI UI = new ResponsiveUI();
			Thread t = new Thread(UI);
			task = i;
			while(taskRunner() != true){
			t.start();
				}
			}
		scan.close();
	}
	
	@Override
	public void run() {
		time = getInput(task);
		taskRunner();
	}

	public int getInput(int i){
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		return input;
	}
	
	
}
