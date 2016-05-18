package com.yc.cinema.TypeService.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.service.impl.TypeServiceImpl;

public class TypeServiceImplTest {

	@Test
	public void testGetTypes() {
		TypeService ts=new TypeServiceImpl();
		List<FilmType> fts=ts.getTypes();
		System.out.println(fts);
		assertNotNull(fts);
	}

}














