package com.ganesh.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.Model.Topic;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")   //http://localhost:8083/topics
	public List<Topic> getalltopics() {
		return topicService.getAlltopics();
		
	}
	
	@RequestMapping("/topic/{id}")   //http://localhost:8083/topic
	public Topic gettopic(@PathVariable int id) {
		
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")  //http://localhost:8083/topics
	public void addtopic(@RequestBody Topic topic) {
		
		topicService.addTopic(topic);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")  //http://localhost:8083/topics/1
	public void updatetopic(@RequestBody Topic topic,@PathVariable int id ) {
		
		topicService.updateTopic(id,topic);

	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void  deletetopic(@PathVariable int id) {
		 topicService.deletetopic(id);
		
	}	

	
}
