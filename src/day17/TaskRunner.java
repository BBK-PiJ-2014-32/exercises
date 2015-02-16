package day17;

public class TaskRunner extends Thread{
	
	private boolean finished;
	
	public TaskRunner(){
		finished = false;
	}
	
	
	public synchronized boolean taskRunner(int time, int task){
		try{
			TaskRunner newTask = new TaskRunner();
			Thread t = new Thread(newTask);
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
