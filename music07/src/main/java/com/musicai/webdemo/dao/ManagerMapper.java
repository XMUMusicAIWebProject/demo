package com.musicai.webdemo.dao;

import com.musicai.webdemo.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper extends ISqlMapper{
    Manager queryManagerByAccount(String account);

}
