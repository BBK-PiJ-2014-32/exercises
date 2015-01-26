import java.util.ArrayList;
import java.util.List;


public class HailstoneNumbers {

private static ArrayList<Integer> hailList = new ArrayList<>();
	
	public HailstoneNumbers(){
		this.hailList = hailList;
	}
		
	public static ArrayList<Integer> hailNumbers(Integer input){
		if(input == 1){
			hailList.add(input);
		} else {
				if (input % 2 == 0){
					hailNumbers(input/2);
				} else {
					hailNumbers((input*3 +1));
				}
		} return hailList;
	}
	
	public static void main(String[] args){
		HailstoneNumbers hail = new HailstoneNumbers();
		System.out.println(hail.hailNumbers(24));
		
		
	}

}

