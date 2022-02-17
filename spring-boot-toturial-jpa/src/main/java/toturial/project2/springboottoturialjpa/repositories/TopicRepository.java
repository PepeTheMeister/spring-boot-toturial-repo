package toturial.project2.springboottoturialjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import toturial.project2.springboottoturialjpa.entities.Topic;



public interface TopicRepository extends CrudRepository<Topic, String>{
	
	
	
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic topic)
	//deleteTopic(String id)
}
