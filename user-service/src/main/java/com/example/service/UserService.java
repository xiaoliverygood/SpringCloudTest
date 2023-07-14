package com.example.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.User;
import org.springframework.stereotype.Service;

/**
* @author L
* @description 针对表【user】的数据库操作Service
* @createDate 2023-07-14 17:03:17
*/
@Service
public interface UserService extends IService<User> {

}
