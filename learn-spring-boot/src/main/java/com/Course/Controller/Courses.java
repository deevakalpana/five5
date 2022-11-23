package com.Course.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.been.Cou;

@RestController
public class Courses {
	@GetMapping("/Cou")
	public List<Cou> getAllCourses()
	{
		return Arrays.asList(new Cou(1,"Java", "hello"));
	}

}
