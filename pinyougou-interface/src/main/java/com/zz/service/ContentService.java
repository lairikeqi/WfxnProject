package com.zz.service;

import com.zz.pojo.Content;

import java.io.Serializable;
import java.util.List;

public interface ContentService {

    /**
     * 添加方法
     */
    void save(Content content);

    /**
     * 修改方法
     */
    void update(Content content);

    /**
     * 根据主键id删除
     */
    void delete(Serializable id);

    /**
     * 批量删除
     */
    void deleteAll(Serializable[] ids);

    /**
     * 根据主键id查询
     */
    Content findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Content> findAll();

    /**
     * 多条件分页查询
     */
    List<Content> findByPage(Content content, int page, int rows);

}