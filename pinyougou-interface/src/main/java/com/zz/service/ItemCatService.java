package com.zz.service;

import com.zz.pojo.ItemCat;

import java.io.Serializable;
import java.util.List;

public interface ItemCatService {

    /**
     * 添加方法
     */
    void save(ItemCat itemCat);

    /**
     * 修改方法
     */
    void update(ItemCat itemCat);

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
    ItemCat findOne(Serializable id);

    /**
     * 查询全部
     */
    List<ItemCat> findAll();

    /**
     * 多条件分页查询
     */
    List<ItemCat> findByPage(ItemCat itemCat, int page, int rows);

}