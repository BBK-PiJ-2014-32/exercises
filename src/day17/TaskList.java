package day17;

import java.util.ArrayList;

public class TaskList {
	
	private ArrayList<TaskRunner> taskList = new ArrayList<TaskRunner>();
	
	public void addTasks(TaskRunner task){
		taskList.add(task);
	}
	
	public boolean isEmpty(){
		if(taskList.isEmpty() == true){
			return true;
		} else {
			return false;
		}
	}
	
	public String toString(){
		if(isEmpty() != true){
			return taskList.toString();
		} else {
			return null;
		}
	}
}
