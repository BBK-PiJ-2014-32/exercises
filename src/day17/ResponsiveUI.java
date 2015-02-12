package day17;

import java.util.Scanner;



public class ResponsiveUI implements Runnable {

	private static Scanner scan;
	private int time;
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
		t.start();
			synchronized(t){
				try{
					t.wait();
				} catch (InterruptedException ex){
					ex.printStackTrace();
				}
			}
		}
		scan.close();
	}
	
	@Override
	public void run() {
		try{
			time = getInput(task);
			ResponsiveUI UI2 = new ResponsiveUI();
			Thread t2 = new Thread(UI2);
			t2.sleep(time);
			System.out.println("Thread " + task + " ended.");
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
	}

	public synchronized int getInput(int i){
		System.out.println("Please enter a time in milliseconds for task " + i + ": ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		return input;
	}
}
