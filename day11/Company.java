public class Company{

	public static void main(String [] args){
		LinkedList<String> employeeName = new LinkedListImp<String>();
		LinkedList<Integer> employeeNI = new LinkedListImp<Integer>();
		employeeName.add("John");
		employeeName.add("Jane");
		employeeName.add("Mike");
		employeeName.add("Lynn");
		employeeName.add("Jess");
		employeeName.add("Steve");
		employeeName.add("Matt");
		employeeNI.add(23424);
		employeeNI.add(23452);
		employeeNI.add(12365);
		employeeNI.add(67586);
		employeeNI.add(12765);
		employeeNI.add(23465);
		employeeNI.add(98763);
		employeeName.printList();
		employeeNI.printList();		
	}

}