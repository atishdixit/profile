package com.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProfileApplication {

	@Autowired
	private Environment environment;

	@Value("${server.port}")
	private int localServerPort;

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

	@GetMapping("/profile")
	public String getCurrentProfileRunning(){
		String  profileDetails = "Default Profile is "+environment.getDefaultProfiles()[0] + "| Active Profile is "+environment.getActiveProfiles()[0];

		return profileDetails +"| And Current PORT is "+localServerPort;
	}

}
