package com.house.housemanager.mapper;

import com.house.housemanager.model.UserRent;
import com.house.housemanager.model.UserRentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserRentMapper {
    long countByExample(UserRentExample example);

    int deleteByExample(UserRentExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserRent record);

    int insertSelective(UserRent record);

    List<UserRent> selectByExample(UserRentExample example);

    UserRent selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserRent record, @Param("example") UserRentExample example);

    int updateByExample(@Param("record") UserRent record, @Param("example") UserRentExample example);

    int updateByPrimaryKeySelective(UserRent record);

    int updateByPrimaryKey(UserRent record);
}