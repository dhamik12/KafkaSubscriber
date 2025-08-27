package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.telusko.util.AppConstants;

@SpringBootApplication
public class KafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberApplication.class, args);
	}
		
		@KafkaListener(topics=AppConstants.TOPIC_NAME,groupId="group_telusko_customer")
		public void getCustomerMsg (String customerInfo) {
			
			System.out.println("Msg Recived from Kafka server");
			System.out.println(customerInfo);
	}

}
