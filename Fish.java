public class Fish implements Animal{
	private String name = null;
	private String sound = null;

		public Fish(String name, String sound){
			this.name = name;
			this.sound = sound;
		}

		public String getName(){
			return name;
		}

		public void call(){
			System.out.println(name + " lives in the sea, won't be coming.");
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