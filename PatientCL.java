import java.util.*;

public class PatientCL{
		private String name;
		private int age;
		private String illness;
		private PatientCL nextPatient;
		private PatientCL firstPatient;
		private PatientCL lastPatient;
		private PatientCL patientListStart = HospitalManagerCL.getPatientListStart();

		public PatientCL(String name, int age, String illness){
				this.name = name;
				this.age = age;
				this.illness = illness;
				this.nextPatient = patientListStart;
				//firstPatient = null;
				//this.lastPatient = null;

		}
		//add patient method.
		public void addPatient(PatientCL newPatient){
					if (this.nextPatient == patientListStart){
							this.nextPatient = newPatient;
					} else {
							this.nextPatient.addPatient(newPatient);
					}
		}

		//delete patient method.
		public boolean deletePatient(PatientCL patient){
				if (this.nextPatient == patientListStart){
					return false;
				} else if (this.nextPatient.name.equals(patient.name)){
					this.nextPatient = nextPatient.nextPatient;
					return true;
				} else {
					return this.nextPatient.deletePatient(patient);
				}
		}

		public void printList(){
				System.out.println("Name: " + this.name + ", Age: " + this.age + ", Illness: " + this.illness);
					if (nextPatient != patientListStart){
						nextPatient.printList();
						}
		}

		public int queueLengthRec(){
			if (nextPatient == null){
					return 1;
			}
					int count = nextPatient.queueLengthRec() + 1;
					return count;
			}

		public int queueLengthIter(){
			PatientCL temp = this;
			int count = 0;
			while (temp != null){
				temp = temp.nextPatient;
				count++;
			}
			return count;
		}

		public void printElement(){
				//System.out.println("First linked: " + firstPatient.name);
				System.out.println("Current: " + this.name);
				System.out.println("Next linked: " + this.nextPatient.name);
				System.out.println("Last linked: " + this.lastPatient);
				System.out.println("first linked: " + firstPatient);
		}

}