package com.zz.service;

import com.zz.pojo.SeckillOrder;

import java.io.Serializable;
import java.util.List;

public interface SeckillOrderService {

    /**
     * 添加方法
     */
    void save(SeckillOrder seckillOrder);

    /**
     * 修改方法
     */
    void update(SeckillOrder seckillOrder);

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
    SeckillOrder findOne(Serializable id);

    /**
     * 查询全部
     */
    List<SeckillOrder> findAll();

    /**
     * 多条件分页查询
     */
    List<SeckillOrder> findByPage(SeckillOrder seckillOrder, int page, int rows);

}