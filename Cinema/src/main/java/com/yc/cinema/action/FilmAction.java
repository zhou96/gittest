package com.yc.cinema.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.service.impl.FilmServiceImpl;

public class FilmAction implements ModelDriven<FilmBean>,SessionAware{
	private FilmService filmService;//��Ӱҵ�������
	private FilmBean filmBean;//������������
	private Map<String,Object> session;
	
	
	public FilmAction(){
		filmService=new FilmServiceImpl();
	}
	//��ѯ������
	public String search(){
		LogManager.getLogger().debug("ȡ���Ĳ�ѯ����==��"+filmBean);
		//ȡ�����з��������ĵ�Ӱ��Ϣ
		List<FilmInfo> films=filmService.getFilmsByFilmBean(filmBean);
		session.put("films", films);//�����ݴ���session����ҳ����ʾ
		return "success";
	}
	
	@Override
	public FilmBean getModel() {
		filmBean=new FilmBean();
		return filmBean;
	}
	
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
