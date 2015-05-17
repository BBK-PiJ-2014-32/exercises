public class Node{
	private int key;
	private String name;
	
		public Node(int x, String str){
			key = x;
			name = str;
		}
		
		public String getName(){
			return name;	
		}

		public void setName(String str){
			this.name = str;
		}

		public int getKey(){
			return key;
		}

}