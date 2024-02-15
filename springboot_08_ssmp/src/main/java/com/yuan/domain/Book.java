package com.yuan.domain;

import lombok.Data;

/**
 * @className: Book
 * @package: com.yuan.domain
 * @description:
 * @author: liyuan
 * @create: 2024/02/15 12:00
 * @version: 1.0
 */

//用lombok
@Data
public class Book {
	private Integer id;
	private String type;
	private String name;
	private String description;


}
