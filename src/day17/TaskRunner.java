package day17;

public class TaskRunner extends Thread{
	
	private TaskList myList;
	private Integer taskNumber;
	private Integer taskTime;
	
	public TaskRunner(Integer time, Integer task, TaskList list){
		this.taskNumber = task;
		this.taskTime = time;
		this.myList = list;
	}
	
	@Override
	public void run() {
		taskRunner();
		myList.addTasks(taskNumber);
	}
	
	public synchronized void taskRunner(){
		boolean finished = false;
			try{
				while(!finished){
				Thread.sleep(taskTime);
				finished = true;
				}
			} catch (InterruptedException ex){
				ex.printStackTrace();
			} 
	}

}
