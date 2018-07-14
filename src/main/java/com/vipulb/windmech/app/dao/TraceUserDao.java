package com.vipulb.windmech.app.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.vipulb.windmech.app.beans.TraceUser;

@Mapper
public interface TraceUserDao {

	public TraceUser getLoginDetails(@Param("username") String username);
	
}
