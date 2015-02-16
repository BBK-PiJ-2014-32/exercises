package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	//private TaskList myList;
	private TaskRunner newTask;
	private static int taskNumber = 0;
	private static Scanner scanner;
	
	public ResponsiveUI(TaskRunner task){
		this.newTask = task;
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args){
		TaskRunner myTask = new TaskRunner();
		for(int i = 0; i < 10; i++){	
			ResponsiveUI UI = new ResponsiveUI(myTask);
			Thread t = new Thread(UI);
			taskNumber = i;
			getInput(taskNumber);
			t.start();
		}
	}
	
	@Override
	public void run() {
			newTask.taskRunner(taskNumber);
		}
	
	public static int getInput(int i){
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scanner.nextLine();
		int input = Integer.parseInt(str);
		return input;
	}
}

