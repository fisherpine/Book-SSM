package com.ggbz.service;

import com.ggbz.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     */
    public boolean update(Book book);

    /**
     * 按id删除
     * @param id
     */
    public boolean delete(Integer id);

    /**
     * 查询全部
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
