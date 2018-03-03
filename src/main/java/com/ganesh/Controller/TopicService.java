package com.ganesh.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ganesh.Model.Topic;

@Service
public class TopicService {

	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			
			new Topic(1,"GaneshBook", "Ganesh Book description"),
			new Topic(2,"PappuBook", "Pappu Book description"),
			new Topic(3,"DhamuBook", "Dhamu Book description")
		
			));

	public List<Topic> getAlltopics() {
		return topics;
	}
	
	public Topic getTopic(int id) {
		
		return topics.stream().filter(t-> t.getId()==id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		
		topics.add(topic);
		
		
	}

	public void updateTopic(int id, Topic topic) {
		
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId()==id)
			{
				topics.set(id, topic);
				return;
			}
			
		}

	}

	public void deletetopic(int id) {
		
		topics.removeIf(t->t.getId()==id);
	}
	
	
	
}
