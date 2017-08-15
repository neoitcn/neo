package com.neo.biz;

import java.util.List;
import java.util.Map;

import com.neo.entity.Edu_news;

public interface AdminBiz {

	//插入记录
	int insert(Edu_news record)throws Exception;
	//根据记录修改
	int updateByPrimaryKeySelective(Edu_news record)throws Exception;
	//根据id删除记录
	int deleteByPrimaryKey(Integer id)throws Exception;
    //根据类型和级别查找新闻
    List<Edu_news> findNewsByTypeAndLevel(Map<String,Object> map);
    Edu_news selectByPrimaryKey(Integer id)throws Exception;
	
}
