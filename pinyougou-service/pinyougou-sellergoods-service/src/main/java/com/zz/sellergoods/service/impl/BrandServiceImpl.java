package com.zz.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.common.pojo.PageResult;
import com.zz.mapper.BrandMapper;
import com.zz.pojo.Brand;
import com.zz.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Z.K
 * @create: 2019-06-04 14:22:01
 * @description: This is brandController class!
 **/
@Service(interfaceName = "com.zz.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    //添加品牌
    @Override
    public void save(Brand brand) {
        System.out.println("this is save()");
        brandMapper.insertSelective(brand);
    }

    //修改品牌
    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {

    }

    @Override
    public Brand findOne(Serializable id) {
        return null;
    }

    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    // 分页查询品牌
    @Override
    public PageResult findByPage(Brand brand, int page, int rows) {

        PageInfo<Brand> pageInfo = PageHelper.startPage(page, rows)
                .doSelectPageInfo(new ISelect() {
                    @Override
                    public void doSelect() {
                        brandMapper.selectAll();
                    }
                });
        return new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }
}