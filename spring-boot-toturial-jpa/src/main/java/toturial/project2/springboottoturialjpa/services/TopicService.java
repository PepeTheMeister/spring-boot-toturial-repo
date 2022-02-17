package toturial.project2.springboottoturialjpa.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toturial.project2.springboottoturialjpa.entities.Topic;
import toturial.project2.springboottoturialjpa.repositories.TopicRepository;



@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1,"name1", "desc1"),
			new Topic(2,"name2", "desc2"),
			new Topic(2,"name3", "desc3")
			));

	
	public List<Topic> getAlltopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics; 
	}
	
	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, int id) {
		for(int i = 0; i <topics.size(); i++) {
			if(topics.get(i).getId() == id) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(int id) {
		topics.removeIf(t -> t.getId() == id);
	}
}
