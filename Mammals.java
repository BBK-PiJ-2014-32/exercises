public class Mammals implements Animal{
private String name = null;
	private String sound = null;

		public Mammals(String name){
			this.name = name;
			this.sound = sound;
		}

		public String getName(){
			return name;
		}

		public void call(){
			System.out.println(name + " lives in he sea, won't be coming.");
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

]