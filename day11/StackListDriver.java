public class StackListDriver{

	public static void main(String [] args){
		StackList<Number> list1 = new StackListImp<Integer>();
		StackList<Number> list2 = new StackListImp<Double>();
		list1.push(123);
		list1.push(234);
		list1.push(34);
		list1.push(12.3);
		list2.push(23424);
		list2.push(23452);
		System.out.println(list1.isEmpty());
		list2.pop();
		System.out.println(list2.isEmpty());
		list2.pop();
		System.out.println(list2.isEmpty());

	}

}