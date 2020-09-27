package com.organizer.io.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("Rock","Rock&Roll music")));

	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.equals(id)).findAny().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id){
		for(int i=0; i<topics.size();i++ ){
			if(topic.getId().equals(topics.get(i).getId())){
				topics.set(i, topic);
				return;
			}
		}		
	}
	
	public void deleteTopic(String id){
		topics.removeIf(t->t.getId().equals(id));
	}
	
}
