package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	private Scanner scan;
	private int time;
	private int task;
	
	public ResponsiveUI(int i){
		this.time = 0;
		this.task = i;
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){	
			ResponsiveUI UI = new ResponsiveUI(i);
			Thread t = new Thread(UI);
			t.start();
		}
	}
	
	@Override
	public void run() {
		TaskRunner newTask = new TaskRunner();
		newTask.taskRunner(getInput(task), task);
		}

	public int getInput(int i){
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		return input;
	}
	
	
}
