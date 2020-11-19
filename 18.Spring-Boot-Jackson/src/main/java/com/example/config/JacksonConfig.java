package com.example.config;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class JacksonConfig {
	@Bean
	public ObjectMapper getObjectMap
    ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));per(){
		return mapper;
	}
}
