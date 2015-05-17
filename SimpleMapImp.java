public class SimpleMapImp implements SimpleMap{		
private String[] myMap;
	
	public SimpleMapImp(){
		myMap = new String[100];
	}	
		
	public void put(int key, String name){
		if (myMap[key] == null){
			myMap[key] = name;
			System.out.println(name + " added to key: " + key);
		} else {
			System.out.println(key + " is already used, please select another.");	
		}	
	}
	
	public String get(int key){
		String str = myMap[key];
		return str;
	}
		
	public void remove(int key){
		if (myMap[key] != null){
			myMap[key] = null;
			System.out.println("The entry for: " + key + " has been deleted.");
		} else {
			System.out.println("The entry for: " + key + " is empty.");
		}
	}
	
	public boolean isEmpty(){
		for(int n = 0; n < myMap.length; n++){
			if (myMap[n] == null){
				return true;
			} else {
				return false;
			}
		}return false;
	}
}