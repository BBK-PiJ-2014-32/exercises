package day17;

import java.util.Scanner;



public class ResponsiveUI{

	private TaskList taskList;
	private Scanner scanner;
	
	public ResponsiveUI(){
		scanner = new Scanner(System.in);
		this.taskList = new TaskList();
	}
	
	public static void main(String[] args){	
			ResponsiveUI UI = new ResponsiveUI();
			UI.launch();
	}
	

	public void launch() {
		for(Integer i = 0; i < 10; i++){
			int time = getInput(i);
			Runnable taskRunning = new TaskRunner(time, i, taskList);
			Thread t = new Thread(taskRunning);
			t.start();
			if(!taskList.isEmpty()){
				System.out.println("Finished tasks: " + taskList.toString());
				taskList.deleteAll();
			}
			}
		}
	
	public synchronized Integer getInput(int i){
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scanner.nextLine();
		Integer input = Integer.parseInt(str);
		return input;
	}
}

