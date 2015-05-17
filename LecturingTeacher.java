public class LecturingTeacher{
	
	public static void main(String[] args){
		LecturingTeacher newbie = new LecturingTeacher();
		newbie.run();
	}

	public void run(){
		Lecturer lecturing = new Lecturer("Anon");
		lecturing.doResearch("Some stuff");
		lecturing.teach("Some other stuff");
	
	}
}