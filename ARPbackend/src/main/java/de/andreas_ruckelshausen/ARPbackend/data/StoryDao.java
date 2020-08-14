package de.andreas_ruckelshausen.ARPbackend.data;

import java.util.HashMap;
import java.util.Map;

import de.andreas_ruckelshausen.ARPbackend.exception.ARPDataNotFoundException;
import de.andreas_ruckelshausen.ARPbackend.models.*;

public class StoryDao {

	Map<Integer, Story> storyMap = new HashMap<Integer, Story>();
	
	private static StoryDao singleton = null;

	public static StoryDao getInstance() {
		if (singleton == null) {
			singleton = new StoryDao();
		}
		return singleton;
	}
	
	private StoryDao() {
		super();
		init();
	}

	private void init() {
		Story s = null;

		s = new Story(1, "first story", "do something for the first story");
		storyMap.put(s.getId(), s);
		s = new Story(2, "second story", "do something for the second story");
		storyMap.put(s.getId(), s);
		s = new Story(3, "third story", "do something for the third story");
		storyMap.put(s.getId(), s);		
	}
	
	public Map<Integer, Story> getStories(){
		//TODO log
		System.out.println("dao.getStories...");		
		return storyMap;
	}

	public Story getStory(int id) {
		//TODO log
		System.out.println("dao.getStory...");
		Story story = storyMap.get(id);
		if (story == null) {
			ErrorMessage errMsg = new ErrorMessage("No story found for id: " + id, 404001,"see technical description");
			throw new ARPDataNotFoundException(errMsg);
		}
		return story;
	}
	
	public void addStory(Story newStory) {
		//TODO log
		System.out.println("dao.addStory...");		
		storyMap.put(newStory.getId(),newStory);
	}
	
	public void modifyStory(Story modifiedStory) {
		//TODO log
		System.out.println("dao.modifyStory...");		
		Story oldStory = getStory(modifiedStory.getId());
		if(oldStory != null) {
			storyMap.put(modifiedStory.getId(),modifiedStory);
		}
	}
	
	public void deleteStory(int storyId) {
		//TODO log
		System.out.println("dao.deleteStory...");	
		getStory(storyId); // if not found exception will be thrown and method will be exited
		storyMap.remove(storyId);
	}
}
