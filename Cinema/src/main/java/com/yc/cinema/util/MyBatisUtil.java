package com.yc.cinema.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;


public class MyBatisUtil {
	private static SqlSessionFactory factory;
	
	//����SqlSessionFactory����
	static{
		try {
			//mybatis��Դ������������mybatis�����ļ���������Դ��
			InputStream in=Resources.getResourceAsStream("mybatis.xml");
			
			//ͨ����Դ��������SqlSessionFactory����
			factory=new SqlSessionFactoryBuilder().build(in);
			
		} catch (Exception e) {
			LogManager.getLogger().error("����mybatis.xml����ʧ��!!!",e);
		}
	}
	
	//���SqlSession���ֶ��ύ����
	public static SqlSession getSession(){
		SqlSession session=null;
		if(factory!=null){
			session=factory.openSession();
		}
		return session;
	}
	
	//���SqlSession��isAutoCommitΪtrueʱ���Զ��ύ����
		public static SqlSession getSession(boolean isAutoCommit){
			SqlSession session=null;
			if(factory!=null){
				session=factory.openSession(isAutoCommit);
			}
			return session;
		}
	
	//�ر�session
	public static void close(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
}
