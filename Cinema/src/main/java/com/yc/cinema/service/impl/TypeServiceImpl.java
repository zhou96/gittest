package com.yc.cinema.service.impl;

import java.util.List;



import com.yc.cinema.entity.FilmType;
import com.yc.cinema.mapper.FilmTypeMapper;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.util.MyBatisUtil;

public class TypeServiceImpl implements TypeService{

	private FilmTypeMapper filmTypeMapper;
	
	public TypeServiceImpl(){
		filmTypeMapper=MyBatisUtil.getSession(true).getMapper(FilmTypeMapper.class);
	}
	
	@Override
	public List<FilmType> getTypes() {
		return filmTypeMapper.getAllFileTypes();
	}

}
