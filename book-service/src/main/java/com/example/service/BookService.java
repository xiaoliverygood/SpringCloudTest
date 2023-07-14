package com.example.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Book;
import org.springframework.stereotype.Service;

/**
* @author L
* @description 针对表【book】的数据库操作Service
* @createDate 2023-07-14 17:02:51
*/
@Service
public interface BookService extends IService<Book> {

}
