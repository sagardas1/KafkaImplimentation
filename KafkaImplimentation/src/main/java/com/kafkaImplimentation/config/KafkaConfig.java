package com.kafkaImplimentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {
	
	
	
	KafkaTemplate<String, String> getKafkatemplet;

}
