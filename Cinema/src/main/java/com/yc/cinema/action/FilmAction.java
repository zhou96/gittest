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
	private FilmService filmService;//电影业务处理对象
	private FilmBean filmBean;//接受请求数据
	private Map<String,Object> session;
	
	
	public FilmAction(){
		filmService=new FilmServiceImpl();
	}
	//查询请求处理
	public String search(){
		LogManager.getLogger().debug("取到的查询条件==》"+filmBean);
		//取到所有符合条件的电影信息
		List<FilmInfo> films=filmService.getFilmsByFilmBean(filmBean);
		session.put("films", films);//把数据存入session带到页面显示
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
