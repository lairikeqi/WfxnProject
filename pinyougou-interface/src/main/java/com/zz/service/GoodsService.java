package com.zz.service;

import com.zz.pojo.Goods;

import java.io.Serializable;
import java.util.List;

public interface GoodsService {

    /**
     * 添加方法
     */
    void save(Goods goods);

    /**
     * 修改方法
     */
    void update(Goods goods);

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
    Goods findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Goods> findAll();

    /**
     * 多条件分页查询
     */
    List<Goods> findByPage(Goods goods, int page, int rows);

}