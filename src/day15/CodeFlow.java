package day15;

import java.awt.List;
import java.util.ArrayList;

public class CodeFlow {

	public static void main(String[] args){
		CodeFlow newFlow = new CodeFlow();
		newFlow.launch(0);
	}
	
	
	public void launch(int userInput) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		 try {
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
			 intList.remove(0);
			 System.out.println(intList.get(userInput));
		 } catch (IndexOutOfBoundsException ex) {
			 ex.printStackTrace();
		 	}
		 }
	
}
