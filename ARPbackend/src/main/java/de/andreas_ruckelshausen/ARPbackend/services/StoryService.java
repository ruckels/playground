package de.andreas_ruckelshausen.ARPbackend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.andreas_ruckelshausen.ARPbackend.data.*;
import de.andreas_ruckelshausen.ARPbackend.models.Story;

public class StoryService {
	
	private StoryDao dao = StoryDao.getInstance();
	
	public StoryService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Map<Integer, Story> getStories() {
		return dao.getStories();
	}
	
	public List<Story> getStoryList(){
		List<Story> storyList = new ArrayList<Story>();
		Map<Integer, Story> storyMap = getStories();
		
		for( Map.Entry<Integer, Story> entry : storyMap.entrySet()) {
            int id = entry.getKey();
            storyList.add(storyMap.get(id));
        }	
		
		return storyList;
	}
	
	public Story getStory(int id) {
		return dao.getStory(id);
	}

	/**
	 * 
	 * @param newStory
	 * @return int id of new created story
	 */
	public Story addStory(Story newStory) {
		int newId = getStories().size() + 1; // just for test .... is not safe
		newStory.setId(newId);     
		dao.addStory(newStory);
		return newStory;
	}
	
	public void modifyStory(Story modifiedStory) {
        dao.modifyStory(modifiedStory);
	}
	
	public void deleteStory(int storyId) {
		dao.deleteStory(storyId);
	}	
}
