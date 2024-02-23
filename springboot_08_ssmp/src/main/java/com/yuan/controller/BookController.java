package com.yuan.controller;

import com.yuan.domain.Book;
import com.yuan.service.IBookService;
import com.yuan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @className: BookController
 * @package: com.yuan.controller
 * @description:
 * @author: liyuan
 * @create: 2024/02/20 11:41
 * @version: 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private IBookService bookService;

	@GetMapping
	public Result getAll() {
		return new Result(true, bookService.list());
	}

	@PostMapping
	public Result save(@RequestBody Book book) {
		return new Result(bookService.save(book));
	}

	@PutMapping
	public Result update(@RequestBody Book book) {
		return new Result(bookService.modify(book));
	}

	@DeleteMapping("{id}")
	public Result delete(@PathVariable Integer id) {
		return new Result(bookService.delete(id));
	}

	@GetMapping("{id}")
	public Result getById(@PathVariable Integer id) {
		return new Result(true, bookService.getById(id));
	}

	@GetMapping("{currentPage}/{pageSize}")
	public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
		return new Result(true, bookService.getPage(currentPage, pageSize, null));
	}
}
