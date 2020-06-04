package com.example.springboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String viewHome() {
		return "To-Do List for JAVA Programming DA3 by Robin Thomas deployed in following link: https://radiant-cliffs-58750.herokuapp.com GitHub Repo for APP: https://github.com/TheRealHazzard/To-Do-list-Version-3 ";
	}

}
