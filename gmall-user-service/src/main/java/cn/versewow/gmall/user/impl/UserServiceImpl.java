package cn.versewow.gmall.user.impl;



import cn.versewow.gmall.service.UserService;
import cn.versewow.gmall.user.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public String test() {
        return "测试Service";
    }
}
