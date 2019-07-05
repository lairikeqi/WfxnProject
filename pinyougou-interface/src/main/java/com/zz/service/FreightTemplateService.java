package com.zz.service;

import com.zz.pojo.FreightTemplate;

import java.io.Serializable;
import java.util.List;

public interface FreightTemplateService {

    /**
     * 添加方法
     */
    void save(FreightTemplate freightTemplate);

    /**
     * 修改方法
     */
    void update(FreightTemplate freightTemplate);

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
    FreightTemplate findOne(Serializable id);

    /**
     * 查询全部
     */
    List<FreightTemplate> findAll();

    /**
     * 多条件分页查询
     */
    List<FreightTemplate> findByPage(FreightTemplate freightTemplate, int page, int rows);

}