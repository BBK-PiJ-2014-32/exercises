public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhone myPhone = new SmartPhone(null, null, "Apple");
		myPhone.browseWeb("www.notanaddress.comish");
		myPhone.findPosition();
		myPhone.rignAlarm("5:00am");
		myPhone.playGame();
		myPhone.call("999");
		myPhone.call("0007772");
		String brandTest1 = myPhone.getBrand();
		System.out.println(brandTest1);
		MobilePhone myPhone2 = new MobilePhone(null, "Nokia");
		String brandTest2 = myPhone2.getBrand();
		System.out.println(brandTest2);
		OldPhone myPhone3 = new OldPhone("Binatone");
		String brandTest3 = myPhone3.getBrand();
		System.out.println(brandTest3);
	}
}