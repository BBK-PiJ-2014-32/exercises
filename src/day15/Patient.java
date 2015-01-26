package day15;

public class Patient{
	private String name;
	private int age;
	private Patient nextPatient;

	public Patient(String name, int age){
		if (age > 130){
			throw new IllegalArgumentException(Integer.toString(age));
		} else {
			this.name = name;
			this.age = age;
			this.nextPatient = null;
		}
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
			System.out.println("Name: " + this.name + ", Age: " + this.age);
				if (nextPatient != null){
					nextPatient.printList();
					}
	}
}