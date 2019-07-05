package com.zz.service;

import com.zz.pojo.User;

import java.io.Serializable;
import java.util.List;

public interface UserService {

    /**
     * 添加方法
     */
    void save(User user);

    /**
     * 修改方法
     */
    void update(User user);

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
    User findOne(Serializable id);

    /**
     * 查询全部
     */
    List<User> findAll();

    /**
     * 多条件分页查询
     */
    List<User> findByPage(User user, int page, int rows);

}