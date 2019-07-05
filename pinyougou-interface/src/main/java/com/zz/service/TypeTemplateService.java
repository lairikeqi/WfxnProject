package com.zz.service;

import com.zz.pojo.TypeTemplate;

import java.io.Serializable;
import java.util.List;

public interface TypeTemplateService {

    /**
     * 添加方法
     */
    void save(TypeTemplate typeTemplate);

    /**
     * 修改方法
     */
    void update(TypeTemplate typeTemplate);

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
    TypeTemplate findOne(Serializable id);

    /**
     * 查询全部
     */
    List<TypeTemplate> findAll();

    /**
     * 多条件分页查询
     */
    List<TypeTemplate> findByPage(TypeTemplate typeTemplate, int page, int rows);

}