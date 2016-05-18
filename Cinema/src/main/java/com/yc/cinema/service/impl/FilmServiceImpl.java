package com.yc.cinema.service.impl;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.mapper.FilmInfoMapper;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.util.MyBatisUtil;

public class FilmServiceImpl implements FilmService {
	private FilmInfoMapper filmInfoMapper;
	
	public FilmServiceImpl(){
		filmInfoMapper=MyBatisUtil.getSession().getMapper(FilmInfoMapper.class);
	}
	
	@Override
	public List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean) {
		return filmInfoMapper.getFilmsByFilmBean(filmBean);
	}

}
