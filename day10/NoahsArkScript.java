public class NoahsArkScript{

	public static void main(String[] args){
		NoahsArkScript newArk = new NoahsArkScript();
		newArk.run();
	}

	public void run(){
	Animal bears = new Mammals("Bears", "Growl");
	bears.call();
	Animal beatles = new Insects("Beatles", "Grunt");
	beatles.call();
	Animal cats = new Mammals("Lions", "Roar");
	cats.call();
	Animal crocodiles = new Reptiles("Crocs", "Sneer");
	crocodiles.call();
	Animal dolphins = new Mammals("Dolphins", "Click");
	dolphins.call();
	Animal eagles = new Birds("Eagles", "Call");
	eagles.call();
	Animal flies = new Insects("Flies", "Buzz");
	flies.call();
	Animal frogs = new Amphibians("Frogs", "Ribbet");
	frogs.call();
	Animal lizards = new Reptiles("Lizards", "Chirp");
	lizards.call();
	Animal monkeys = new Mammals("Monkeys", "Chatter");
	monkeys.call();
	Animal pigeons = new Birds("Pigeons", "Coo");
	pigeons.call();
	Animal salmon = new Fish("Salmon", "Burp");
	salmon.call();
	Animal sharks = new Fish("Sharks", "Grunt");
	sharks.call();
	Animal snakes = new Reptiles("Snakes", "Sssss");
	snakes.call();
	Animal whales = new Mammals("Whales", "Click");
	whales.call();
	bears.makeSound();
	bears.reproduce();
	beatles.makeSound();
	beatles.reproduce();
	cats.makeSound();
	cats.reproduce();
	crocodiles.makeSound();
	crocodiles.reproduce();
	dolphins.makeSound();
	dolphins.reproduce();
	eagles.makeSound();
	eagles.reproduce();
	flies.makeSound();
	flies.reproduce();
	frogs.makeSound();
	frogs.reproduce();
	lizards.makeSound();
	lizards.reproduce();
	monkeys.makeSound();
	monkeys.reproduce();
	pigeons.makeSound();
	pigeons.reproduce();
	salmon.makeSound();
	salmon.reproduce();
	sharks.makeSound();
	sharks.reproduce();
	snakes.makeSound();
	snakes.reproduce();
	whales.makeSound();
	whales.reproduce();
	}
}