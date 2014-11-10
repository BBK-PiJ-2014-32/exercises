public class HospitalManager{
	private Patient patientListStart = null;

	public static void main(String [] args){

		HospitalManager hm = new HospitalManager();
		hm.launch();
	}

		//add patients.
		public void launch(){
			Patient pat1 = new Patient("John", 45, "Knee pain");
			patientListStart = pat1;
			Patient pat2 = new Patient("Laura", 22, "Head pain");
			patientListStart.addPatient(pat2);
			Patient pat3 = new Patient("Mike", 30, "Sore throat");
			patientListStart.addPatient(pat3);
			Patient pat4 = new Patient("Dave", 41, "Chest infection");
			patientListStart.addPatient(pat4);
			Patient pat5 = new Patient("Sarah", 18, "Leg pain");
			patientListStart.addPatient(pat5);
			Patient pat6 = new Patient("George", 12, "Slipped disc");
			patientListStart.addPatient(pat6);
			Patient pat7 = new Patient("Steve", 75, "Rash");
			patientListStart.addPatient(pat7);
			Patient pat8 = new Patient("Maria", 36, "Acne");
			patientListStart.addPatient(pat8);
			Patient pat9 = new Patient("Jane", 25, "Broken leg");
			patientListStart.addPatient(pat9);
			Patient pat10 = new Patient("Rachael", 26, "Stomach pain");
			patientListStart.addPatient(pat10);

			//print out list
			patientListStart.printList();
			//change list start pointer.
			patientListStart = pat2;
			patientListStart.deletePatient(pat1);
			patientListStart.deletePatient(pat7);
			System.out.println();
			patientListStart.printList();

			//count patients in list recursively.
			int count = patientListStart.queueLengthRec();
			System.out.println("There are " + count + " patients in the queue.");

			//count patients in the list iteratively.
			patientListStart.queueLengthIter();

	}


}