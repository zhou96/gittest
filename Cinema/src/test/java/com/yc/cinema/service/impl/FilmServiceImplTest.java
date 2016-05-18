package com.yc.cinema.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.service.FilmService;

public class FilmServiceImplTest {

	@Test
	public void testGetFilmsByFilmBean() {
		FilmService fs=new FilmServiceImpl();
		FilmBean filmBean=new FilmBean();
		//filmBean.setFilmname("´ó");
		filmBean.setMinprice(10.0);
		List<FilmInfo> fis=fs.getFilmsByFilmBean(filmBean);
		System.out.println(fis);
		assertNotNull(fis);
	}

}
