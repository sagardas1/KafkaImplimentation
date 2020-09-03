package com.kafkaImplimentation.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.kafkaImplimentation.vo.UserDetails;

@Configuration
public class KafkaConfig {

	@Bean
	public ProducerFactory<String, UserDetails> producerFactory() {
		Map<String, Object> config = new HashMap<String, Object>();

		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.01:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, String.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<String, UserDetails>(config);
	}
	
	

}
