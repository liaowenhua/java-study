package com.lwh.spring.dao.mapper;

import com.lwh.spring.dao.model.PgcUser;
import com.lwh.spring.dao.model.PgcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgcUserMapper {
    int countByExample(PgcUserExample example);

    int deleteByExample(PgcUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(PgcUser record);

    int insertSelective(PgcUser record);

    List<PgcUser> selectByExample(PgcUserExample example);

    PgcUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") PgcUser record, @Param("example") PgcUserExample example);

    int updateByExample(@Param("record") PgcUser record, @Param("example") PgcUserExample example);

    int updateByPrimaryKeySelective(PgcUser record);

    int updateByPrimaryKey(PgcUser record);
}