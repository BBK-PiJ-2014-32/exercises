package day15;

import java.util.ArrayList;

public class PrimeDivisorList implements PrimeDivisor {

	private static ArrayList<Integer> primeList = new ArrayList<>();
	
	@Override
	public void add(Integer input) {
		int result = 0;
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
	}

	@Override
	public void remove(int index) {
		
		
	}

	@Override
	public String toString(){
		return null;
	}
	
	public boolean checkPrime(int input){
		
	}
	
}
