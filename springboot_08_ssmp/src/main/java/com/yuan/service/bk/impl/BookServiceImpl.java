package com.yuan.service.bk.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.dao.BookDao;
import com.yuan.domain.Book;
import com.yuan.service.bk.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: BookServiceImpl
 * @package: com.yuan.service.bk.impl
 * @description:
 * @author: liyuan
 * @create: 2024/02/18 0:59
 * @version: 1.0
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public Boolean save(Book book) {
		return bookDao.insert(book) > 0;
	}

	@Override
	public Boolean update(Book book) {
		return bookDao.updateById(book) > 0;
	}

	@Override
	public Boolean delete(Integer id) {
		return bookDao.deleteById(id) > 0;
	}

	@Override
	public Book getById(Integer id) {
		return bookDao.selectById(id);
	}

	@Override
	public List<Book> getAll() {
		return bookDao.selectList(null);
	}

	@Override
	public IPage<Book> getPage(int currentPage, int pageSize) {
		IPage page = new Page(currentPage, pageSize);
		bookDao.selectPage(page, null);
		return page;
	}
}
