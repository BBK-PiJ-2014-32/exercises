import java.util.ArrayList;
import java.util.List;


public class HailstoneNumbers {

	private static ArrayList<Integer> List = null;	
	
	public static List<Integer> generate (Integer input){
		List<Integer> hailList = new ArrayList<>();
		
	}

	public static Integer hailNumbers(Integer input){
		if(input == 1){
			return ;
		} else if (input % 2 == 0) {
			input = hai
			return hailNumbers((input)/2);
		} else {
			return hailNumbers(((input*3) + 1));
		}
	}

	public static void main(String[] args){
		HailstoneNumbers hail = new HailstoneNumbers();
		System.out.println(hail.hailNumbers(5));
	}
}

