package com.zz.service;

import com.zz.pojo.Address;

import java.io.Serializable;
import java.util.List;

public interface AddressService {

    /**
     * 添加方法
     */
    void save(Address address);

    /**
     * 修改方法
     */
    void update(Address address);

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
    Address findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Address> findAll();

    /**
     * 多条件分页查询
     */
    List<Address> findByPage(Address address, int page, int rows);

}