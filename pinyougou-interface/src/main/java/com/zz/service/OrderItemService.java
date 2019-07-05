package com.zz.service;

import com.zz.pojo.OrderItem;

import java.io.Serializable;
import java.util.List;

public interface OrderItemService {

    /**
     * 添加方法
     */
    void save(OrderItem orderItem);

    /**
     * 修改方法
     */
    void update(OrderItem orderItem);

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
    OrderItem findOne(Serializable id);

    /**
     * 查询全部
     */
    List<OrderItem> findAll();

    /**
     * 多条件分页查询
     */
    List<OrderItem> findByPage(OrderItem orderItem, int page, int rows);

}