package com.yuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: BookController
 * @package: com.yuan.controller
 * @description:
 * @author: liyuan
 * @create: 2024/02/15 0:56
 * @version: 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping
	public String getById() {
		System.out.println("springboot demo01 is running... ");
		return "springboot demo01 is running... ";
	}
}
