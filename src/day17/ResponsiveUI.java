package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	private Scanner scan;
	private boolean finished;
	private int task;
	private static int count = 0;
	private static String finishedTasks = "Tasks finished: ";
	
	public ResponsiveUI(int i){
		this.finished = false;
		this.task = i;
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){	
			ResponsiveUI UI = new ResponsiveUI(i);
			Thread t = new Thread(UI);
			t.start();
				/*synchronized(t){
					try{
						t.join();
					} catch (InterruptedException ex){
						ex.printStackTrace();
					}
			}*/
			finishedTasks += i + ", ";

		}
	}
	
	@Override
	public void run() {
		if(finishedTasks.length() < 17){
			taskRunner();		
		} else {
			System.out.println(finishedTasks);
		}
	}

	public int getInput(int i){
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		return input;
	}
	
	public synchronized boolean taskRunner(){
		try{
			Thread.sleep(getInput(task));
			finished = true;
			count++;
			return finished;
		} catch (InterruptedException ex){
			ex.printStackTrace();
		} 
		return false;
	}
	
	public void taskFinisher(){
		finishedTasks = "Tasks finished: ";
	}

	public static void resetCount(){
		count = 0;
	}
}

