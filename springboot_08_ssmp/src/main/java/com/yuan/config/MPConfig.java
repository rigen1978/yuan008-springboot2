package com.yuan.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MPConfig
 * @package: com.yuan.config
 * @description:
 * @author: liyuan
 * @create: 2024/02/16 1:19
 * @version: 1.0
 */
@Configuration
public class MPConfig {
	@Bean
	public MybatisPlusInterceptor mybatisPlusInterceptor() {
		MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
		//添加分页拦截器
		interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
		return interceptor;
	}
}
