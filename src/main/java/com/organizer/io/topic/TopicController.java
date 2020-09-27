package com.organizer.io.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService service;
	
	@GetMapping("/topics")
	public List<Topic> getTopics(){
		return service.getTopics();
	}

	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return service.getTopic(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic){
		service.addTopic(topic);
	}
	
	@PutMapping("/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
		service.updateTopic(topic, id);
	}
	
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable String id){
		service.deleteTopic(id);
	}
}



