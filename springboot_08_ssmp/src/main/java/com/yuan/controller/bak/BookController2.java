package com.yuan.controller.bak;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yuan.domain.Book;
import com.yuan.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @className: BookController
 * @package: com.yuan.controller
 * @description:
 * @author: liyuan
 * @create: 2024/02/20 11:41
 * @version: 1.0
 */
//@RestController
@RequestMapping("/books")
public class BookController2 {
	@Autowired
	private IBookService bookService;

	@GetMapping
	public List<Book> getAll() {
		return bookService.list();
	}

	@PostMapping
	public Boolean save(@RequestBody Book book) {
		return bookService.save(book);
	}

	@PutMapping
	public Boolean update(@RequestBody Book book) {
		return bookService.modify(book);
	}

	@DeleteMapping("{id}")
	public Boolean delete(@PathVariable Integer id) {
		return bookService.delete(id);
	}

	@GetMapping("{id}")
	public Book getById(@PathVariable Integer id) {
		return bookService.getById(id);
	}

	@GetMapping("{currentPage}/{pageSize}")
	public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
		return bookService.getPage(currentPage, pageSize, null);
	}
}
