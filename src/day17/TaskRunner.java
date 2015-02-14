package day17;

public class TaskRunner {
	
	private boolean finished;
	
	public TaskRunner(){
		finished = false;
	}
	
	
	public boolean taskRunner(Thread t, int time, int task){
		try{
			t.sleep(time);
			System.out.println("Thread " + task + " ended.");
			finished = true;
			return finished;
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
		return finished;
	}
}
