public class Insects implements Animal{
	private String name = null

		public Insects(String name){
			this.name = name;
		}

		public String getName(){
			return name;
		}

		public call(){
			System.out.println(name + " coming...");
		}

		public reproduce(){
			this.layEggs();
		}

		public layEggs(){
			System.out.println(name + " laying lots of eggs.");
		}
}