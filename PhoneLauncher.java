public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		MobilePhone myPhone = new SmartPhone();
		testPhone(myPhone);
		myPhone.browseWeb("www.notanaddress.comish");
		myPhone.findPosition();
		myPhone.rignAlarm("5:00am");
		myPhone.playGame();
		myPhone.call("999");
		myPhone.call("0007772");

		}

	public void testPhone(Phone phone){
		phone.call("999");

	}

}