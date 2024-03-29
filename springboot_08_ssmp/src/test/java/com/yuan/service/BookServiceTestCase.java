package com.yuan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yuan.domain.Book;
import com.yuan.service.bk.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @className: BookServiceTestCase
 * @package: com.yuan.service
 * @description:
 * @author: liyuan
 * @create: 2024/02/18 1:05
 * @version: 1.0
 */
@SpringBootTest
public class BookServiceTestCase {
	@Autowired
	private BookService bookService;


	@Test
	void testGetById() {
		System.out.println(bookService.getById(4));
	}

	@Test
	void testSave() {
		Book book = new Book();
		book.setType("测试数据123");
		book.setName("测试数据123");
		book.setDescription("测试数据123");
		bookService.save(book);
	}

	@Test
	void testUpdate() {
		Book book = new Book();
		book.setId(18);
		book.setType("测试数据abcdefg");
		book.setName("测试数据123");
		book.setDescription("测试数据123");
		bookService.update(book);
	}

	@Test
	void testDelete() {
		bookService.delete(16);
	}

	@Test
	void testGetAll() {
		bookService.getAll();
	}

	@Test
	void testGetPage() {
		IPage<Book> page = bookService.getPage(2, 5);
		System.out.println(page.getCurrent());
		System.out.println(page.getSize());
		System.out.println(page.getTotal());
		System.out.println(page.getPages());
		System.out.println(page.getRecords());
	}

}
