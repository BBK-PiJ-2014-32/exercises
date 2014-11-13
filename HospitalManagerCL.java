public class HospitalManagerCL{
	private static PatientCL patientListStart = null;

	public static void main(String [] args){

		HospitalManagerCL hm = new HospitalManagerCL();
		hm.launch();
	}

		//add patients.
		public void launch(){
			PatientCL pat1 = new PatientCL("John", 45, "Knee pain");
			patientListStart = pat1;
			//patientListStart.addPatient(pat1);
			PatientCL pat2 = new PatientCL("Laura", 22, "Head pain");
			patientListStart.addPatient(pat2);
			PatientCL pat3 = new PatientCL("Mike", 30, "Sore throat");
			patientListStart.addPatient(pat3);
			//PatientCL pat4 = new PatientCL("Dave", 41, "Chest infection");
			//patientListStart.addPatient(pat4);
			//PatientCL pat5 = new PatientCL("Sarah", 18, "Leg pain");
			//patientListStart.addPatient(pat5);
			//PatientCL pat6 = new PatientCL("George", 12, "Slipped disc");
			pat2.printElement();
			pat3.printElement();
			//patientListStart.addPatient(pat6);
			//PatientCL pat7 = new PatientCL("Steve", 75, "Rash");
			//patientListStart.addPatient(pat7);
			//PatientCL pat8 = new PatientCL("Maria", 36, "Acne");
			//patientListStart.addPatient(pat8);
			//PatientCL pat9 = new PatientCL("Jane", 25, "Broken leg");
			//patientListStart.addPatient(pat9);
			//PatientCL pat10 = new PatientCL("Rachael", 26, "Stomach pain");
			//patientListStart.addPatient(pat10);

			//print out list
			//patientListStart.printList();
			//change list start pointer.
			//patientListStart = pat2;
			//patientListStart.deletePatient(pat1);
			//patientListStart.deletePatient(pat7);
			//System.out.println();
			//patientListStart.printList();

			//count patients in list recursively.
			//int count = patientListStart.queueLengthRec();
			//System.out.println("There are " + count + " patients in the queue.");

			//count patients in the list iteratively.
			//int count2 = patientListStart.queueLengthIter();
			//System.out.println("There are " + count + " patients in the queue.");


	}

		public static PatientCL getPatientListStart() {
			return patientListStart;
	}
}