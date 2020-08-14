package de.arn.MyRestService.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.arn.MyRestService.model.Task;

public class Database {
	Map<Long, Task> taskMap = null;
	static Database instance = null;
	long taskIdSequenz = 0L;

	private Database() {
		super();
		
	}
	
	public static Database getInstance(){
		if (instance == null) {
			instance = new Database();
			instance.initData();
		}
		return instance;
	}

	public void initData() {
		taskMap = new HashMap<Long,Task>();
		taskMap.put(++taskIdSequenz, new Task(taskIdSequenz, "erste Aufgabe", "Mitarbeiter 1", new Date(), 10.0));
		taskMap.put(++taskIdSequenz, new Task(taskIdSequenz, "zweite Aufgabe", "Mitarbeiter 2", new Date(), 20.0));
		taskMap.put(++taskIdSequenz, new Task(taskIdSequenz, "dritte Aufgabe", "Mitarbeiter 3", new Date(), 30.0));
	}

	public List<Task> getAllTasks() {
		return new ArrayList<Task>(taskMap.values());
	}

	public Task createTask(Task newTask){
		newTask.setId(++taskIdSequenz);
		taskMap.put(newTask.getId(),newTask);
		return newTask;
	}
	
	public Task getTask(long id){
		return taskMap.get(id);
	}
	
	public Task updateTask(Task newTask){
		taskMap.put(newTask.getId(),newTask);
		return newTask;
	}
	
	public void removeTask(long id){
		taskMap.remove(id);
	}
	
}
