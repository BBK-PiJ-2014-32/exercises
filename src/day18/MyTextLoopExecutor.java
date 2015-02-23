package day18;

import java.util.concurrent.*;
import java.util.Scanner;

public class MyTextLoopExecutor implements Runnable {
	
	public static final int COUNT = 10;
	private final String name;
	private static Scanner scan;
	private static MyExecutor executor;
	
	public MyTextLoopExecutor(String name){
				this.name = name;
	}
		
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
			}
	}
	
	public static void main(String[] args) {
		System.out.println("USAGE: java TextLoop <mode>");
		System.out.println(" mode 0: without threads");
		System.out.println(" mode 1: with threads");
		scan = new Scanner(System.in);
		String str = scan.nextLine();
		Integer input = Integer.parseInt(str);		
		if (input == 0) {
			for (int i = 0; i < 10; i++) {
				Runnable r = new MyTextLoopExecutor("Thread " + i);
				r.run();	
			}
		} else {
			for (int i = 0; i < 10; i++) {
				Runnable r = new MyTextLoopExecutor("Thread " + i);
				executor.execute(r);
			}
		}
	}
	
}