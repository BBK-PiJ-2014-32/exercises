package day15;

import java.util.ArrayList;

public class PrimeDivisorList implements PrimeDivisor {

	private static ArrayList<Integer> primeList = new ArrayList<>();
	
	@Override
	public void add(Integer input) {
		try {int result = 0;
		int j = 2;
		while (j <= input / 2){
			if (input % j == 0) {
						result = 1;
			} j++;
		}
		if (result == 1) {
			throw new IllegalArgumentException("Not a prime");
		} else {
			primeList.add(input);
		}	
		} catch (NullPointerException ex){
			System.out.println("null number not allowed");
		}
	}

	@Override
	public void remove(int index) {
		primeList.remove(index);
		
	}

	@Override
	public String toString(){
		String returnStr = "";
		for(int i = 0; i < primeList.size(); i++){
			if(primeList.get(i) != null){
				returnStr =+ primeList.get(i) + " ";
			} else {
				return returnStr;
			}
		} return returnStr;
		
	}
	
}
