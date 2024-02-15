package com.yuan;

import com.yuan.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo04ApplicationTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void contextLoads() {
		bookDao.save();
		
	}

}
