package com.yuan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuan.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @className: BookDao
 * @package: com.yuan.dao
 * @description:
 * @author: liyuan
 * @create: 2024/02/16 0:29
 * @version: 1.0
 */

@Mapper
public interface BookDao extends BaseMapper<Book> {

	//这是普通做法，没有实用mybatis-plus
	//@Select("select * from tbl_book where id = #{id}")
	//Book getById(Integer id);
}
