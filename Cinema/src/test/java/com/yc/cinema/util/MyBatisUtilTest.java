package com.yc.cinema.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class MyBatisUtilTest {

	@Test
	public void testGetSession() {
		Connection con=MyBatisUtil.getSession().getConnection();
		assertNotNull("数据库连接失败！！",con);
	}

}
