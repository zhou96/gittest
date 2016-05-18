package com.yc.cinema.action;
import java.util.List;





import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.service.impl.TypeServiceImpl;

public class TypeAction {
	private TypeService typeService;
	private List<FilmType> filmTypes;//响应的数据
	
	public TypeAction(){
		typeService=new TypeServiceImpl();
	}
	public List<FilmType> getFilmTypes(){
		return filmTypes;
	}
	
	//struts json插件处理异步请求，处理与正常请求一样
	public String getTypes(){
		filmTypes=typeService.getTypes();//响应的数据
		return "success";
	}
	
}













