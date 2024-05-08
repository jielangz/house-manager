package com.house.housemanager.mapper;

import com.house.housemanager.model.Complain;
import com.house.housemanager.model.ComplainExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ComplainMapper {
    long countByExample(ComplainExample example);

    int deleteByExample(ComplainExample example);

    int deleteByPrimaryKey(String complainId);

    int insert(Complain record);

    int insertSelective(Complain record);

    List<Complain> selectByExample(ComplainExample example);

    Complain selectByPrimaryKey(String complainId);

    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByPrimaryKeySelective(Complain record);

    int updateByPrimaryKey(Complain record);
}