package day15;

public class PrimeDivisorListDriver {

		public static void main(String[] args){
			PrimeDivisorListDriver pdld = new PrimeDivisorListDriver();
			pdld.run();
		}

		public void run(){
			PrimeDivisor newList = new PrimeDivisorList();
			newList.add(5);
			newList.add(5);
			newList.add(7);
			newList.add(13);
			newList.add(1);
			//newList.add(10);
			newList.remove(0);
			String str = newList.toString();
			System.out.println(str);
		}
}

