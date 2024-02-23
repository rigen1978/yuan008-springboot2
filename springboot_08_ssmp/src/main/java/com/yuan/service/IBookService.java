package com.yuan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yuan.domain.Book;

/**
 * @className: IBookService
 * @package: com.yuan.service
 * @description:
 * @author: liyuan
 * @create: 2024/02/20 10:46
 * @version: 1.0
 */
public interface IBookService extends IService<Book> {
	boolean saveBook(Book book);

	boolean modify(Book book);

	boolean delete(Integer id);

	IPage<Book> getPage(int currentPage, int pageSize);

	IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
