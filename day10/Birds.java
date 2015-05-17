public class Birds implements Animal{
	private String name = null;
	private String sound = null;

		public Birds(String name, String sound){
			this.name = name;
			this.sound = sound;
		}

		public String getName(){
			return name;
		}

		public void call(){
			System.out.println(name + " now flying, will come later when tired...");
		}

		public void reproduce(){
			this.layEggs();
		}

		public void layEggs(){
			System.out.println(name + " laying lots of eggs.");
		}

		public void makeSound(){
			System.out.println(name + " " + sound + "ing!");
		}

}