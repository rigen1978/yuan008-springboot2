package com.yuan;

import com.yuan.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo05ApplicationTests {
	@Autowired
	private BookDao bookDao;

	@Test
	void contextLoads() {
		System.out.println(bookDao.getById(1));
	}

}
