package com.zz.service;

import com.zz.pojo.Item;

import java.io.Serializable;
import java.util.List;

public interface ItemService {

    /**
     * 添加方法
     */
    void save(Item item);

    /**
     * 修改方法
     */
    void update(Item item);

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
    Item findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Item> findAll();

    /**
     * 多条件分页查询
     */
    List<Item> findByPage(Item item, int page, int rows);

}