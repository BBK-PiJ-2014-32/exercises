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
		File out = null;
		BufferedReader br = null;
		try{
			in = new File (getInput(scanner)); 
			out = new File (getInput(scanner));
				if(in.exists() == true){
					FileInputStream fis = new FileInputStream(in);
					br = new BufferedReader(new InputStreamReader(fis));
					
					FileWriter fstream = new FileWriter(out, true);
					BufferedWriter output = new BufferedWriter(fstream);
					String line = null;
					
					 while ((line = br.readLine()) != null) {
						 output.write(line);  
						 output.newLine();
					 }
					 output.close();
				} else {
					System.out.println("File does not exist");
				}
				
			} catch(NullPointerException ex) {
					ex.printStackTrace();
			} catch (FileNotFoundException ex) {
					System.out.println("File " + in + " does not exist.");
			} catch (IOException ex) {
					ex.printStackTrace();
			}	finally {
						try {
							if (br != null) {
								br.close();
								scanner.close();
							}
						} catch (IOException ex) {
							ex.printStackTrace();
						}
			}
		}

		
	public String getInput(Scanner scanner){
		System.out.println("Please enter a file name: ");
		String str = scanner.nextLine();
		return str;
	}
}

