package com.yc.cinema.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class MyBatisUtilTest {

	@Test
	public void testGetSession() {
		Connection con=MyBatisUtil.getSession().getConnection();
		assertNotNull("���ݿ�����ʧ�ܣ���",con);
	}

}
