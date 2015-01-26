package day15;

import java.util.Scanner;



public class ErrorHandling {

	int result = 0;
	
	public static void main(String[] args){
		ErrorHandling errIn = new ErrorHandling();
		errIn.launch();
		
	}
	
	public void launch(){
	try{
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
		System.out.println("Please enter a number: ");
		String str = scan.nextLine();
		int x = Integer.parseInt(str);
		result += x;
			}
		System.out.println(result/10);
		}	catch (NumberFormatException ex){
			System.out.println("ERROR - you did not enter an integer");
		}
	}


}