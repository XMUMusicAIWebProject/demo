package com.musicai.webdemo.security;


import com.musicai.webdemo.entity.Manager;
import com.musicai.webdemo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final ManagerService managerService;

    @Autowired
    MyUserDetailsService(ManagerService managerService){
        this.managerService = managerService;
    }

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        System.out.println("+++++++++++++++++public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException");

        Manager manager = managerService.queryManagerByAccount(account);
        System.out.println("account:"+account+"  password:"+manager.getPassword());

        //密码加密
        BCryptPasswordEncoder util = new BCryptPasswordEncoder();
        String password = util.encode(manager.getPassword());

        if (manager == null){
            throw new UsernameNotFoundException("用户不存在！");
        }
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = createAuthorities("ROLE_USER");
        return new User(manager.getAccount(), password, simpleGrantedAuthorities);
    }

    /**
     * 权限字符串转化
     *
     * 如 "USER,ADMIN" -> SimpleGrantedAuthority("USER") + SimpleGrantedAuthority("ADMIN")
     *
     * @param roleStr 权限字符串
     */
    private List<SimpleGrantedAuthority> createAuthorities(String roleStr){
        String[] roles = roleStr.split(",");
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        for (String role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return simpleGrantedAuthorities;
    }

}