import java.util.*;

public class PatientDL{
		private String name;
		private int age;
		private String illness;
		private PatientDL nextPatient;
		private PatientDL curPatient;
		private PatientDL lastPatient;

		public PatientDL(String name, int age, String illness){
				this.name = name;
				this.age = age;
				this.illness = illness;
				this.nextPatient = null;
				this.curPatient = null;
				this.lastPatient = null;
		}
		//add patient method.
		public void addPatient(PatientDL newPatient){
			PatientDL temp = this;
				if (this.nextPatient == null){
					this.nextPatient = newPatient;
					this.nextPatient.lastPatient = this;

			} else {
				this.nextPatient.addPatient(newPatient);
			}
		}

		//delete patient method.
		public boolean deletePatient(PatientDL patient){
				if (this.nextPatient == null){
					return false;
				} else if (this.nextPatient.name.equals(patient.name)){
					this.nextPatient = nextPatient.nextPatient;
					this.lastPatient = lastPatient.lastPatient;
					return true;
				} else {
					return this.nextPatient.deletePatient(patient);
				}
		}

		public void printList(){
				System.out.println("Name: " + this.name + ", Age: " + this.age + ", Illness: " + this.illness);
					if (nextPatient != null){
						nextPatient.printList();
						}
		}

		public void printListRev(){
						System.out.println("Name: " + this.name + ", Age: " + this.age + ", Illness: " + this.illness);
							if (lastPatient != null){
								lastPatient.printList();
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
			PatientDL temp = this;
			int count = 0;
			while (temp != null){
				temp = temp.nextPatient;
				count++;
			}
			return count;
		}

		public void printElement(){
				PatientDL temp = this;
				System.out.println("Last linked: " + lastPatient.name);
				System.out.println("Current: " + temp.name);
				System.out.println("Next linked: " + nextPatient.name);
		}

}