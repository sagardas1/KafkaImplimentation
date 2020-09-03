package com.kafkaImplimentation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserController {
	
	public static final String TOPIC="MES";
	
	
	@Autowired
	private KafkaTemplate<String, String> getKafkatemplet;
	
	@GetMapping(value="/getname/{name}")
	public String getName(@PathVariable(value="name")String name) {
		getKafkatemplet.send(TOPIC, name);
		
		return name;
		
	}

}
