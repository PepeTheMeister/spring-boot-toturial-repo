package toturial.project2.springboottoturialjpa.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import toturial.project2.springboottoturialjpa.dto.TopicDTO;



@Service
public class TopicService {
	
	private List<TopicDTO> topics = new ArrayList<>(Arrays.asList(
			new TopicDTO("id1","name1", "desc1"),
			new TopicDTO("id2","name2", "desc2"),
			new TopicDTO("id3","name3", "desc3")
			));

	
	public List<TopicDTO> getAlltopics(){
		return topics; 
	}
	
	public TopicDTO getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(TopicDTO topic) {
		topics.add(topic);
	}

	public void updateTopic(TopicDTO topic, String id) {
		for(int i = 0; i <topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
