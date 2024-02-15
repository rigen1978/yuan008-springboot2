package com.yuan.dao;

import com.yuan.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @className: BookDao
 * @package: com.yuan.dao
 * @description:
 * @author: liyuan
 * @create: 2024/02/15 12:01
 * @version: 1.0
 */
@Mapper
public interface BookDao {
	@Select("select * from tbl_book where id=#{id}")
	public Book getById(Integer id);

}
