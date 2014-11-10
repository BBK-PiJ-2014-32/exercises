public class HospitalManagerDL{
	private PatientDL patientListStart = null;
	private PatientDL patientListEnd = null;

	public static void main(String [] args){

		HospitalManagerDL hm = new HospitalManagerDL();
		hm.launch();
	}

		//add patients.
		public void launch(){
			PatientDL pat1 = new PatientDL("John", 45, "Knee pain");
			patientListStart = pat1;
			PatientDL pat2 = new PatientDL("Laura", 22, "Head pain");
			patientListStart.addPatient(pat2);
			PatientDL pat3 = new PatientDL("Mike", 30, "Sore throat");
			patientListStart.addPatient(pat3);
			PatientDL pat4 = new PatientDL("Dave", 41, "Chest infection");
			patientListStart.addPatient(pat4);
			PatientDL pat5 = new PatientDL("Sarah", 18, "Leg pain");
			patientListStart.addPatient(pat5);
			PatientDL pat6 = new PatientDL("George", 12, "Slipped disc");
			patientListStart.addPatient(pat6);
			PatientDL pat7 = new PatientDL("Steve", 75, "Rash");
			patientListStart.addPatient(pat7);
			PatientDL pat8 = new PatientDL("Maria", 36, "Acne");
			patientListStart.addPatient(pat8);
			PatientDL pat9 = new PatientDL("Jane", 25, "Broken leg");
			patientListStart.addPatient(pat9);
			PatientDL pat10 = new PatientDL("Rachael", 26, "Stomach pain");
			patientListStart.addPatient(pat10);
			patientListEnd = pat10;

			//print out list
			patientListStart.printList();
			patientListEnd.printListRev();


			patientListStart.deletePatient(pat7);
			//System.out.println();
			patientListStart.printList();

			//count patients in list recursively.
			//int count = patientListStart.queueLengthRec();
			//System.out.println("There are " + count + " patients in the queue.");

			//count patients in the list iteratively.
			//int count2 = patientListStart.queueLengthIter();
			//System.out.println("There are " + count + " patients in the queue.");

			//pat2.printElement();
			//pat7.printElement();
			//pat9.printElement();


	}


}