package com.zz.service;

import com.zz.pojo.Provinces;

import java.io.Serializable;
import java.util.List;

public interface ProvincesService {

    /**
     * 添加方法
     */
    void save(Provinces provinces);

    /**
     * 修改方法
     */
    void update(Provinces provinces);

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
    Provinces findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Provinces> findAll();

    /**
     * 多条件分页查询
     */
    List<Provinces> findByPage(Provinces provinces, int page, int rows);

}