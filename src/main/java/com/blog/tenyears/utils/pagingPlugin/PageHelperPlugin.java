package com.blog.tenyears.utils.pagingPlugin;

import java.util.Properties;

import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

/**
 * 创建人: 小谢 创建时间: 2018年10月25日 下午12:59:27 修改人 : 小谢 修改时间 :2018年10月25日 下午12:59:27
 */
public class PageHelperPlugin {

	// 配置mybatis的分页插件pageHelper
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("dialect", "mysql"); // 配置mysql数据库的方言
		pageHelper.setProperties(properties);
		return pageHelper;
	}
}
