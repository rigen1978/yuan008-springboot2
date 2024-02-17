package com.yuan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yuan.domain.Book;

import java.util.List;

/**
 * @className: BookService
 * @package: com.yuan
 * @description:
 * @author: liyuan
 * @create: 2024/02/18 0:56
 * @version: 1.0
 */
public interface BookService {
	Boolean save(Book book);

	Boolean update(Book book);

	Boolean delete(Integer id);

	Book getById(Integer id);

	List<Book> getAll();

	IPage<Book> getPage(int currentPage, int pageSize);
}
