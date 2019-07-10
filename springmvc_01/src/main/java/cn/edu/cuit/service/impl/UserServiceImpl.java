package cn.edu.cuit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.cuit.mapper.UserMapper;
import cn.edu.cuit.service.UserService;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
	  private UserMapper userMapper;
	@Override
	public boolean login(String name, String pass) {
		int ret = userMapper.findUserByNameAndPwd(name,pass);
		if(ret>0) {
			return true;
		}
		return false;
	}

}
