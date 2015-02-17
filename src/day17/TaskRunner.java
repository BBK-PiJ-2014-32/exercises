package day17;

public class TaskRunner extends Thread{
	
	private  TaskList myList = new TaskList();
	
	public TaskRunner(){
	}
	
	
	public synchronized void taskRunner(Integer time, Integer task){
			try{
				if(myList.isEmpty() == true){
					Thread.sleep(time);
				} else {
					System.out.println(myList.toString());
				}
			} catch (InterruptedException ex){
				ex.printStackTrace();
			} finally{
				myList.addTasks(task);
			}

	}

}
