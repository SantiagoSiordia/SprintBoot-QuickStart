package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/add")
	public String add(@RequestParam(value = "n1", defaultValue = "0") String n1, @RequestParam(value = "n2", defaultValue = "0") String n2) {
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		return String.format("The sum of %d and %d is %d", num1, num2, num1 + num2);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}