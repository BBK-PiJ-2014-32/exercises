package day15;

import java.util.Scanner;

public class MorePatients {

	private Patient patientListStart = null;
	
	public static void main(String[] args){
	MorePatients mp = new MorePatients();
	mp.launch();
	}

	//add patients.
	public void launch(){
		Patient pat1 = new Patient("John", 45);
		patientListStart = pat1;
		Patient pat2 = new Patient("Laura", 22);
		patientListStart.addPatient(pat2);
		Patient pat3 = new Patient("Mike", 135);
		patientListStart.addPatient(pat3);

		
	}
}
