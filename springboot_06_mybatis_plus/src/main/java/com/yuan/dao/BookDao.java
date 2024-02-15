package com.yuan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuan.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @className: BookDao
 * @package: com.yuan.dao
 * @description:
 * @author: liyuan
 * @create: 2024/02/15 12:01
 * @version: 1.0
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
