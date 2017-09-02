package com.ma.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SpringBootStarterThymeleafApplication {

	@RequestMapping("/")
	public String index(Model model) {
		Person singlePerson = new Person("Matt",30);
		List<Person> people = new ArrayList<Person>();
		Person singlePerson1 = new Person("Matt1",31);
		Person singlePerson2 = new Person("Matt2",32);
		Person singlePerson3= new Person("Matt3",33);
		people.add(singlePerson1);
		people.add(singlePerson2);
		people.add(singlePerson3);
		
		model.addAttribute("singlePerson", singlePerson);
		model.addAttribute("people", people);
		
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterThymeleafApplication.class, args);
	}
}
