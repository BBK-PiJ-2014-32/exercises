package day16;
import java.*;
import java.io.File;

public class Is {
	
	public static void main(String [] args){
	
		File f = null;
		String [] paths;
	try{	
		f = new File ("/Users/philhannant/git/Day16/");
		
		paths = f.list();
		
		for(String path:paths){
			System.out.println(path);
			}
		} catch(Exception e) {
			e.printStackTrace();
	}
	}

}
