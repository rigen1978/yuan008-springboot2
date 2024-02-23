package com.yuan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.domain.Book;
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
public class IBookServiceTestCase {
	@Autowired
	private IBookService bookService;


	@Test
	void testGetById() {
		System.out.println(bookService.getById(1));
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
		bookService.updateById(book);
	}

	@Test
	void testDelete() {
		bookService.removeById(16);
	}

	@Test
	void testGetAll() {
		bookService.list();
	}

	@Test
	void testGetPage() {

		IPage<Book> page = new Page<Book>(2, 5);
		bookService.page(page);
		System.out.println(page.getCurrent());
		System.out.println(page.getSize());
		System.out.println(page.getTotal());
		System.out.println(page.getPages());
		System.out.println(page.getRecords());
	}

}
