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
	//异步请求处理，所以不需要跳转页面，
	//返回类型使用void或者返回类型为String时,返回类型使用none
	public String getTypes(){
		System.out.println(123);
		List<FilmType> types=typeService.getTypes();
		Gson gson=new Gson();//json处理对象
		String jsonResult=gson.toJson(types);//把对象转换成json字符串
		LogManager.getLogger().debug("转换成的json字符串==》"+jsonResult);
		
		//不进行页面跳转，输出数据流给请求页面
		try {
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setCharacterEncoding("utf-8");
			response.setContentType("charset=utf-8");
			PrintWriter out=response.getWriter();//取到响应对象
			out.print(jsonResult);//写出响应数据
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "none";//none表示不跳转页面
	}
}













