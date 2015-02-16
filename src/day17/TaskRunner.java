package day17;

public class TaskRunner extends Thread{
	
	private int taskLength;
	
	public TaskRunner(int time){
		this.taskLength = time;
	}
	
	
	public synchronized void taskRunner(){
		try{
			Thread.sleep(taskLength);
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
	}

}
