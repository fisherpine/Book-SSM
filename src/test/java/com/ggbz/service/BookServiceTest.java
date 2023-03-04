package com.ggbz.service;

import com.ggbz.config.SpringConfig;
import com.ggbz.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
//@ContextConfiguration注解来标注我们想要导入这个测试类的某些bean。
//当这些bean收集起来之后，当我们想要在某个测试类使用@Autowired注解来引入这些收集起来的bean时，
//只需要给这个测试类添加@ContextConfiguration注解来标注我们想要导入这个测试类的某些bean。
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private  BookService bookService;
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
