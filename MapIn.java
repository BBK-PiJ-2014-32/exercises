public class MapIn {
	public static void main(String[] args) {
		SimpleMap myMap = new SimpleMapImp();

		myMap.put(6, "Betty");
		myMap.put(7, "Fred");
		myMap.put(3, "John");
		myMap.put(70, "Joe");
		myMap.put(3, "Esha");

		myMap.remove(6);
		myMap.remove(12);
		myMap.remove(3);
	}
}