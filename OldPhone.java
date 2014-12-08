public class OldPhone implements Phone{

		public String getBrand(){
			return brand;
		}

		public void call(String number){
			System.out.println("Calling <" + number + ">");
		}


}