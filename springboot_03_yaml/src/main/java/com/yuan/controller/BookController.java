package com.yuan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

	// 从ymal中读取数据
	@Value("${country}")
	private String country1;

	@Value("${user.name}")
	private String name1;

	@Value("${user.age}")
	private String age1;

	@GetMapping
	public String getById() {
		System.out.println("country1 ===> " + country1);
		System.out.println("name1 ===> " + name1);
		System.out.println("age1 ===> " + age1);
		return "test springboot is running...2";
	}

}
