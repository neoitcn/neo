package com.neo.biz.impl;

import java.util.List;
import java.util.Map;

import com.neo.biz.AdminBiz;
import com.neo.entity.Edu_news;
import com.neo.mapper.Edu_newsMapper;

public class AdminBizImpl  implements  AdminBiz{
	Edu_newsMapper newsMapper;
	


	@Override
	public int insertSelective(Edu_news record) {
		// TODO Auto-generated method stub
		return newsMapper.insertSelective(record);
	}
	@Override
	public int updateByPrimaryKeySelective(Edu_news record) throws Exception {
		// TODO Auto-generated method stub
		return newsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return newsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Edu_news> findNewsByTypeAndLevel(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return newsMapper.findNewsByTypeAndLevel(map);
	}

	@Override
	public Edu_news selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return newsMapper.selectByPrimaryKey(id);
	}
	public Edu_newsMapper getNewsMapper() {
		return newsMapper;
	}

	public void setNewsMapper(Edu_newsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	
	
	
	

}
