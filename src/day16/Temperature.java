package day16;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
	
public class Temperature {

	public static void main(String[] args){
		Temperature theTemp = new Temperature();
		theTemp.run();
	}
		
	public void run(){
		Scanner scanner = new Scanner(System.in);
		File in = null;
		String input = "";
		int ave = 0;
		BufferedReader br = null;
		try{
			in = new File("input.csv");
			scanner = new Scanner(in);	
			scanner.useDelimiter(",");
				while(scanner.hasNext()){
					
					input = scanner.next();
					input.split(",");
					ave = ave + Integer.parseInt(input);
					System.out.println(ave);
				}
				scanner.close();
				
			} catch(NullPointerException ex) {
					ex.printStackTrace();
			} catch (FileNotFoundException ex) {
					System.out.println("File " + in + " does not exist.");
			} catch (IOException ex) {
					ex.printStackTrace();
			} catch (NumberFormatException ex){
					System.out.println(input + " is not an int");
			}
		}

		
	public String getInput(Scanner scanner){
		System.out.println("Please enter a file name: ");
		String str = scanner.nextLine();
		return str;
	}
}

