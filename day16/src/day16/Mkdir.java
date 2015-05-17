package day16;
import java.io.File;
import java.util.Scanner;

public class Mkdir {

		public static void main(String [] args){
		Mkdir dirCre = new Mkdir();
		dirCre.run();	
		}
		public void run(){	
		boolean boo = false;
			
		try{	
			boo = new File(getInput()).mkdirs();
			System.out.println("new directory created = " + boo);
			
			} catch(NullPointerException e) {
				e.printStackTrace();
			}
		}
		
		public String getInput(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter directory name: ");
			String str = scan.nextLine();
			return str;
		}

}
