package day16;

import java.io.File;
import java.util.Scanner;

public class Cat {

	public static void main(String[] args){
		Cat theCat = new Cat();
		theCat.run();
	}
	
	public void run(){
		File f = null;
		
		try{
			f = new File (getInput()); 
				if(f.exists()){
					System.out.println(f);
				}
			
			} catch(NullPointerException e) {
				e.printStackTrace();
			}
		}

	
	public String getInput(){
		System.out.println("Please enter directory name: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		return str;
	}
}
