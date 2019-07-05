package com.zz.service;

import com.zz.pojo.Specification;

import java.io.Serializable;
import java.util.List;

public interface SpecificationService {

    /**
     * 添加方法
     */
    void save(Specification specification);

    /**
     * 修改方法
     */
    void update(Specification specification);

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
    Specification findOne(Serializable id);

    /**
     * 查询全部
     */
    List<Specification> findAll();

    /**
     * 多条件分页查询
     */
    List<Specification> findByPage(Specification specification, int page, int rows);

}