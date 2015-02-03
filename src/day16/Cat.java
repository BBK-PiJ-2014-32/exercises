package day16;

import java.util.Scanner;

public class Cat {

	public static void main(String[] args){
		
	}
	
	public void run(){
		
	}
	
	public String getInput(){
		System.out.println("Please enter directory name: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		return str;
	}
}
