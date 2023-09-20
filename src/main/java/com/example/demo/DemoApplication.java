package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/getInfo")
	public Map<String, String> getData(@RequestBody Map<String, Integer> message) {
		Map<String, String> json = new HashMap<String, String>();
		int year = message.get("year");
		json.put("year", String.valueOf(year));
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			json.put("isLeap", "YES");
		} else {
			json.put("isLeap", "NO");
		}

		return json;
	}
}
