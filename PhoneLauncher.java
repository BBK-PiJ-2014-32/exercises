public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		MobilePhone myPhone = new SmartPhone();
		testPhone(myPhone);
		MobilePhone castPhone = new MobilePhone();
		testPhone(castPhone);

		}

	public void testPhone(Phone phone){
		SmartPhone newPhone = (SmartPhone) phone;
		newPhone.browseWeb("www.notanaddress.comish");
		newPhone.findPosition();
		newPhone.rignAlarm("5:00am");
		newPhone.playGame();
		newPhone.call("999");
		newPhone.call("0007772");
	}

}