package com.house.housemanager.mapper;

import com.house.housemanager.model.HouseDetails;
import com.house.housemanager.model.HouseDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HouseDetailsMapper {
    long countByExample(HouseDetailsExample example);

    int deleteByExample(HouseDetailsExample example);

    int deleteByPrimaryKey(String houseDetailsId);

    int insert(HouseDetails record);

    int insertSelective(HouseDetails record);

    List<HouseDetails> selectByExample(HouseDetailsExample example);

    HouseDetails selectByPrimaryKey(String houseDetailsId);

    int updateByExampleSelective(@Param("record") HouseDetails record, @Param("example") HouseDetailsExample example);

    int updateByExample(@Param("record") HouseDetails record, @Param("example") HouseDetailsExample example);

    int updateByPrimaryKeySelective(HouseDetails record);

    int updateByPrimaryKey(HouseDetails record);
}