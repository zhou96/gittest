package com.yc.cinema.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.service.impl.TypeServiceImpl;

public class TypeAction02 {
	private TypeService typeService;
	
	public TypeAction02(){
		typeService=new TypeServiceImpl();
	}
	//�첽���������Բ���Ҫ��תҳ�棬
	//��������ʹ��void���߷�������ΪStringʱ,��������ʹ��none
	public String getTypes(){
		System.out.println(123);
		List<FilmType> types=typeService.getTypes();
		Gson gson=new Gson();//json�������
		String jsonResult=gson.toJson(types);//�Ѷ���ת����json�ַ���
		LogManager.getLogger().debug("ת���ɵ�json�ַ���==��"+jsonResult);
		
		//������ҳ����ת�����������������ҳ��
		try {
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setCharacterEncoding("utf-8");
			response.setContentType("charset=utf-8");
			PrintWriter out=response.getWriter();//ȡ����Ӧ����
			out.print(jsonResult);//д����Ӧ����
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "none";//none��ʾ����תҳ��
	}
}













