package cn.versewow.gmall.gmalluser.user.service.impl;

import cn.versewow.gmall.gmalluser.user.mapper.UserMapper;
import cn.versewow.gmall.gmalluser.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
}
