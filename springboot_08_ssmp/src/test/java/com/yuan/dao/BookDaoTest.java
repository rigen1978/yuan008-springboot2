package com.yuan.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @className: BookDaoTest
 * @package: com.yuan.dao
 * @description:
 * @author: liyuan
 * @create: 2024/02/16 0:32
 * @version: 1.0
 */
@SpringBootTest
public class BookDaoTest {
	@Autowired
	private BookDao bookDao;

	//@Test
	//void testGetById() {
	//	System.out.println(bookDao.getById(1));
	//}

	//mabatis-plus的测试方法
	@Test
	void testGetById() {
		System.out.println(bookDao.selectById(1));
	}

	@Test
	void testSave() {
		Book book = new Book();
		book.setType("test");
		book.setName("test");
		book.setDescription("test");
		bookDao.insert(book);
	}

	@Test
	void testUpdate() {
		Book book = new Book();
		book.setId(15);
		book.setType("test111");
		book.setName("test111");
		book.setDescription("test111");
		bookDao.updateById(book);
	}

	@Test
	void testDelete() {
		bookDao.deleteById(15);
	}


	@Test
	void testGetAll() {
		bookDao.selectList(null);
	}

	//分页功能
	@Test
	void testGetpage() {
		//需要添加拦截器，才能进行分页功能
		IPage page = new Page(1, 5);
		bookDao.selectPage(page, null);
		System.out.println(page.getCurrent());
		System.out.println(page.getPages());
		System.out.println(page.getSize());
		System.out.println(page.getTotal());
		System.out.println(page.getRecords());
	}

	@Test
	void testGetBy() {
		QueryWrapper<Book> qw = new QueryWrapper<>();
		qw.like("name", "Spring");
		bookDao.selectList(qw);
	}

	@Test
	void testGetBy2() {
		String name = "1";
		LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
		//if(name != null) lqw.like(Book::getName,name);
		lqw.like(name != null, Book::getName, name);
		bookDao.selectList(lqw);
	}


}
