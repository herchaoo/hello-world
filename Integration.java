package com.atguigu.service;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

public class Integration {
	public static void main(String[] args) throws Exception {
		Properties pros = new Properties();
		InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
		pros.load(is);
		DataSource ds = DruidDataSourceFactory.createDataSource(pros);
		Connection conn = ds.getConnection();
		System.out.println(conn);
	}
}