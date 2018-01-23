package com.rajat.controller.topic;
import java.util.*;

import com.rajat.controller.pojo.PhoneGeoLocation;
import com.rajat.controller.topic.*;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private static List<String> topics = new ArrayList<String>();
	
	public List<String> getAllTopics() {
		return topics;
	}

	public static void addTopic(String topic) {
		topics.add(topic);
	}
}
