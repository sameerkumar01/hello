package com.sameer.learn_spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class restapi {
	@RequestMapping("/sameer")
	public List<Course> getCources()
	{
		return Arrays.asList(
				new Course(1, "Learn AWS", "sameer"),
				new Course(2, "Learn DevOps", "pankaj"),
				new Course(3, "Learn Azure", "kushal"),
				new Course(5, "Learn java", "amet"),
				new Course(4, "Learn GCP", "joker"));
	}

}
