package com.rajat.controller.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.controller.pojo.*;
import java.util.List;
@RestController
public class TopicController {

	//injected by Spring
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<String> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody String topic) {
		topicService.addTopic(topic);
	}

}
