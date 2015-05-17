public class Mammals implements Animal{
	private String name = null;
	private String sound = null;

		public Mammals(String name, String sound){
			this.name = name;
			this.sound = sound;
		}

		public String getName(){
			return name;
		}

		public void call(){
			if (this.name.equals("Whales") || this.name.equals("Dolphins")){
			System.out.println(name + " lives in the sea, won't be coming.");
			}else {
			System.out.println(name + " coming...");
			}
		}

		public void reproduce(){
			this.giveBirth();
		}

		public void giveBirth(){
			System.out.println(name + " giving birth.");
		}

		public void makeSound(){
			System.out.println(name + " " + sound + "ing!");
		}

}