public class Amphibians implements Animal{
	private String name = null;
	private String sound = null;

		public Amphibians(String name, String sound){
			this.name = name;
			this.sound = sound;
		}

		public String getName(){
			return name;
		}

		public void call(){
			System.out.println(name + ", going to go for a swim, will not be coming.");
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