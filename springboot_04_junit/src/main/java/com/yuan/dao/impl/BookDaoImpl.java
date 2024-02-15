package com.yuan.dao.impl;

import com.yuan.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @className: BookDaoImpl
 * @package: com.yuan.dao.impl
 * @description:
 * @author: liyuan
 * @create: 2024/02/15 10:48
 * @version: 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {
	@Override
	public void save() {
		System.out.println("book dao is running ...");
	}
}
