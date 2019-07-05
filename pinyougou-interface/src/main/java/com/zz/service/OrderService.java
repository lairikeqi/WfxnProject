package com.zz.service;

import com.zz.pojo.Order;

import java.io.Serializable;
import java.util.List;

public interface OrderService {

    /**
     * 添加方法
     */
    void save(Order order);

    /**
     * 修改方法
     */
    void update(Order order);

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
    Order findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Order> findAll();

    /**
     * 多条件分页查询
     */
    List<Order> findByPage(Order order, int page, int rows);

}