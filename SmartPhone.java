public class SmartPhone extends MobilePhone{

	public void browseWeb(String str){
		System.out.println(str + " cannot be found.");
	}

	public void findPosition(){
		System.out.println("You are on 51st Street, NYC");
	}

	@Override
	public void call(String number){
		if(number.substring(0,2).equals("00")){
			System.out.println("Calling <" + number + "> through the internet to save money");
		} else {
		super.call(number);
		}
	}
}