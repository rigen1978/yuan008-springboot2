package com.yuan.util;

import lombok.Data;

/**
 * @className: Result
 * @package: com.yuan.util
 * @description:
 * @author: liyuan
 * @create: 2024/02/23 10:45
 * @version: 1.0
 */
@Data
public class Result {
	private Boolean flag;
	private Object data;

	public Result() {

	}

	public Result(Boolean flag) {
		this.flag = flag;
	}

	public Result(Boolean flag, Object data) {
		this.flag = flag;
		this.data = data;
	}
}
