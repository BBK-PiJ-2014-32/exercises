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
		ResponsiveUI UI = new ResponsiveUI(getInput());
		for(int i = 0; i <10; i++){
			
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public static int getInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a time in milliseconds: ");
		String str = scan.nextLine();
		int input = Integer.parseInt(str);
		scan.close();
		return input;
	}
}
