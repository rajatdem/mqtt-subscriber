package com.rajat.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rajat.controller.pojo.MQTTConnection;
import com.rajat.controller.pojo.PhoneGeoLocation;
import com.rajat.controller.topic.TopicService;

@Service
public class MqttSubscriber implements MqttCallback, InitializingBean {

	@Autowired
    MqttClient mqttClient;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		mqttClient.setCallback(this);
		mqttClient.subscribe("#");
	}

	@Override
	public void connectionLost(Throwable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void messageArrived(String topic, MqttMessage message)  {
		System.out.println(topic);
		String payload = new String (message.getPayload());
		if (topic.contains("location")) {
			System.out.println("Topic name " + topic + " payload " + payload);
			try {
				JSONObject json = new JSONObject(payload);
				PhoneGeoLocation phone = new PhoneGeoLocation(json.getDouble("longitude"), json.getDouble("latitude"));
				TopicService.addTopic(phone.toString());
			} catch (JSONException e){
				e.printStackTrace();
			}
		}
	}

}
