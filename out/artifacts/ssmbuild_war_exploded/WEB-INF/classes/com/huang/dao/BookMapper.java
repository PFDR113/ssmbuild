package com.huang.dao;

import com.huang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookByID(@Param("bookID") int id);
    //更新一本书
    int updateBook(Books books);
    //根据BookID查询一本书
    Books queryBookByID(@Param("bookID") int id);
    //查询全本的书
    List<Books> queryAllBook();
    //
    Books queryBookByName(@Param("bookName") String bookName);
}
