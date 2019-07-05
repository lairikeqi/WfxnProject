package com.zz.service;

import com.zz.pojo.Seller;

import java.io.Serializable;
import java.util.List;

public interface SellerService {

    /**
     * 添加方法
     */
    void save(Seller seller);

    /**
     * 修改方法
     */
    void update(Seller seller);

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
    Seller findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Seller> findAll();

    /**
     * 多条件分页查询
     */
    List<Seller> findByPage(Seller seller, int page, int rows);

}