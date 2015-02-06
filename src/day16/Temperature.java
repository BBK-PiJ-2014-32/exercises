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
		FileReader inFile = null;
		BufferedReader br = null;
		File in = null;
		String input = "";
		String line = "";
		int ave = 0;
		int count = 0;
		int totalAve = 0;
		int totalCount = 0;
		try{
			in = new File("input.csv");
			//inFile = new FileReader(in);
			FileInputStream fis = new FileInputStream(in);
			br = new BufferedReader(new InputStreamReader(fis));
			//scanner = new Scanner(in);
			//scanner.useDelimiter(",");
			line = br.readLine();
			
			while(line != null){
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while(scanner.hasNextInt()){
					input = scanner.next();
					int x = Integer.parseInt(input.trim());
					ave = ave + x;
					totalAve = totalAve + x;
					count++;
					totalCount++;
					}
				ave = ave/count;
				System.out.println("Line average = " + ave);
				ave = 0;
				count = 0;
				line = br.readLine();
				}
				scanner.close();
				totalAve = totalAve/totalCount;
				System.out.println("Total average = " + totalAve);
				
			} catch(NullPointerException ex) {
					ex.printStackTrace();
			} catch (FileNotFoundException ex) {
					System.out.println("File " + in + " does not exist.");
			} catch (IOException ex) {
					ex.printStackTrace();
			} catch (NumberFormatException ex){
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

