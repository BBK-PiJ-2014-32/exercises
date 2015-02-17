package day17;

import java.util.ArrayList;

public class TaskList {
	
	private ArrayList<Integer> taskList = new ArrayList<Integer>();
	
	public void addTasks(Integer task){
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
	
	public int listSize(){
		return taskList.size();
	}
	 public void deleteAll(){
		 taskList.clear();
	 }
}
