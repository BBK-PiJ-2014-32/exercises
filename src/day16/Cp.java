package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
	
public class Cp {

	public static void main(String[] args){
		Cp theCp = new Cp();
		theCp.run();
	}
		
	public void run(){
		File f = null;
		BufferedReader br = null;
		try{
			f = new File (getInput()); 
				if(f.exists() == true){
					br = new BufferedReader(new FileReader(f));
					 String line = null;
					 while ((line = br.readLine()) != null) {
						   System.out.println(line);
						   br.close();
					 }
				} else {
					System.out.println("File does not exist");
				}
				
			} catch(NullPointerException ex) {
					ex.printStackTrace();
			} catch (FileNotFoundException ex) {
					System.out.println("File " + f + " does not exist.");
			} catch (IOException ex) {
					ex.printStackTrace();
			}	finally {
						try {
							if (br != null) {
								br.close();
							}
						} catch (IOException ex) {
							ex.printStackTrace();
						}
			}
		}

		
	public String getInput(){
		System.out.println("Please enter a file name: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		return str;
	}
}

