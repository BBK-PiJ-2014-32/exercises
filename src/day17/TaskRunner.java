package day17;

public class TaskRunner extends Thread{
	
	private int task;
	private static TaskList myList = new TaskList();
	
	public TaskRunner(){
		this.myList = myList;
	}
	
	
	public synchronized void taskRunner(int time){
		if(myList.isEmpty() == true){
			try{
				Thread.sleep(time);
				myList.addTasks(time);
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
		} else {
			System.out.println(myList.toString());
		}

	}

}
