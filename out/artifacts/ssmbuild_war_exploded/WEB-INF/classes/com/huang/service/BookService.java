package com.huang.service;

import com.huang.dao.BookMapper;
import com.huang.pojo.Books;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookByID(int bookID);
    //更新一本书
    int updateBook(Books books);
    //根据BookID查询一本书
    Books queryBookByID(int bookID);
    //查询全本的书
    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}