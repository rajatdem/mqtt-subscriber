package com.rajat.controller.topic;
import java.util.*;

import com.rajat.controller.pojo.PhoneGeoLocation;
import com.rajat.controller.topic.*;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private static List<PhoneGeoLocation> topics = new ArrayList<PhoneGeoLocation>();
	
	public List<PhoneGeoLocation> getAllTopics() {
		return topics;
	}

	public static void addTopic(PhoneGeoLocation topic) {
		topics.add(topic);
	}
}
