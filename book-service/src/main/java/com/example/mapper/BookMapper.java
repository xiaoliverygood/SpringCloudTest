package com.example.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
* @author L
* @description 针对表【book】的数据库操作Mapper
* @createDate 2023-07-14 17:02:51
* @Entity generator.domain.Book
*/
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}




