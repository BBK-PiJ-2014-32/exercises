import java.util.*;

public class Patient{
		private String name;
		private int age;
		private String illness;
		private Patient nextPatient;

		public Patient(String name, int age, String illness){
				this.name = name;
				this.age = age;
				this.illness = illness;
				this.nextPatient = null;
		}
		//add patient method.
		public void addPatient(Patient newPatient){
				if (this.nextPatient == null){
					this.nextPatient = newPatient;
			} else {
				this.nextPatient.addPatient(newPatient);
			}
		}

		//delete patient method.
		public boolean deletePatient(Patient patient){
				if (this.nextPatient == null){
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
					if (nextPatient != null){
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
			Patient temp = this;
			int count = 0;
			while (temp != null){
				temp = temp.nextPatient;
				count++;
			}
			return count;
		}
}