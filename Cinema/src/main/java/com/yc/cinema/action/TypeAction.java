package com.yc.cinema.action;
import java.util.List;





import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.service.impl.TypeServiceImpl;

public class TypeAction {
	private TypeService typeService;
	private List<FilmType> filmTypes;//��Ӧ������
	
	public TypeAction(){
		typeService=new TypeServiceImpl();
	}
	public List<FilmType> getFilmTypes(){
		return filmTypes;
	}
	
	//struts json��������첽���󣬴�������������һ��
	public String getTypes(){
		filmTypes=typeService.getTypes();//��Ӧ������
		return "success";
	}
	
}













