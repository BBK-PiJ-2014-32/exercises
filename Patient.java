public class Patient{
		private String name;
		private int age;
		private Sting illness;

		public Patient(String name, int age, String illness){
				this.name = name;
				this.age = age;
				this.illness = illness;
				this.nextPatient = null;
		}
		//add patient method.
		public void addPatient(Patient new Patient){
				if (this.nextPatient == null){
					this.nextPatient = newPatient;
			} else {
				this.nextPatient.addPatient(newPatient);
		}

		}
	}