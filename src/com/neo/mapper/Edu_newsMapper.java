package com.neo.mapper;

import com.neo.entity.Edu_news;

public interface Edu_newsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Edu_news record);

    int insertSelective(Edu_news record);

    Edu_news selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Edu_news record);

    int updateByPrimaryKey(Edu_news record);
}