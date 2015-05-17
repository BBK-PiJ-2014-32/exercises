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
		int aveCount = getInput();
		for(int i = 0; i < aveCount; i++){
			int x =  getInput();
			result += x;
			}
		System.out.println(result/aveCount);
		}	catch (NumberFormatException ex){
			System.out.println("ERROR - you did not enter an integer");
		}
	}
	
	public int getInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String str = scan.nextLine();
		int x = Integer.parseInt(str);
		return x;
	}

}