package com.rajat.controller.pojo;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQTTConnection {

	final static String SERVER_URL = "tcp://m14.cloudmqtt.com";
	final static int SERVER_PORT = 18923;
	final static String USERNAME = "rajat_mac";
	final static MemoryPersistence persistence = new MemoryPersistence();
	final static char[] PASSWORD = {'t','e','c','h','-','c','o','m'};
	static MqttClient mqttClient;
	
	public static MqttConnectOptions setupConnection() {
		MqttConnectOptions conOpt = new MqttConnectOptions();
		conOpt.setUserName(USERNAME);
		conOpt.setPassword(PASSWORD);
		conOpt.setCleanSession(true);
		return conOpt;
	}
	
	@Bean
	public MqttClient mqttClient() throws MqttException {
		mqttClient = new MqttClient(SERVER_URL+":"+SERVER_PORT, "laptop", persistence);
		mqttClient.connect(setupConnection());
		return mqttClient;
	}
}
