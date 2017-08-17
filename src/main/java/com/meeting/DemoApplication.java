package com.meeting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.meeting.mapper")

public class DemoApplication extends SpringBootServletInitializer {


//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(DemoApplication.class);
//	}
//
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//
//	@Bean
//	public ApplicationStartup applicationStartup() {
//		return new ApplicationStartup();
//	}

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}
}
