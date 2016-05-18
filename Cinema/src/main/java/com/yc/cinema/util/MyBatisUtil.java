package com.yc.cinema.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;


public class MyBatisUtil {
	private static SqlSessionFactory factory;
	
	//创建SqlSessionFactory对象
	static{
		try {
			//mybatis资源加载器，加载mybatis配置文件，生成资源流
			InputStream in=Resources.getResourceAsStream("mybatis.xml");
			
			//通过资源流，创建SqlSessionFactory对象
			factory=new SqlSessionFactoryBuilder().build(in);
			
		} catch (Exception e) {
			LogManager.getLogger().error("加载mybatis.xml配置失败!!!",e);
		}
	}
	
	//获得SqlSession，手动提交事务
	public static SqlSession getSession(){
		SqlSession session=null;
		if(factory!=null){
			session=factory.openSession();
		}
		return session;
	}
	
	//获得SqlSession，isAutoCommit为true时，自动提交事务
		public static SqlSession getSession(boolean isAutoCommit){
			SqlSession session=null;
			if(factory!=null){
				session=factory.openSession(isAutoCommit);
			}
			return session;
		}
	
	//关闭session
	public static void close(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
}
