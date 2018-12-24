package com.musicai.webdemo.service;

import com.musicai.webdemo.dao.ManagerMapper;
import com.musicai.webdemo.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    public Manager queryManagerByAccount(String account){
        return managerMapper.queryManagerByAccount(account);
    }
}
