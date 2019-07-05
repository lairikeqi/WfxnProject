package com.zz.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zz.common.pojo.PageResult;
import com.zz.pojo.Brand;
import com.zz.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Z.K
 * @create: 2019-06-03 19:37:45
 * @description: This is brandController class!
 **/
@RestController
@RequestMapping("/brand")
public class BrandController {

    /**
     * 引用服务接口代理对象
     * timeout: 调用服务接口方法超时时间毫秒数
     */
    @Reference(timeout = 10000)
    private BrandService brandService;

    /**
     * @Description(查询全部品牌)
     * @Param: []
     * @return: java.util.List<com.zz.pojo.Brand>
     * @Date: 2019/6/3
     */
    @GetMapping("/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    /**
     * @Description(添加品牌)
     * @Param:
     * @return:
     * @Date: 2019/6/15
     */
    @PostMapping("/save")
    public boolean save(@RequestBody Brand brand) {
        System.out.println("brand: " + brand);
        try {
            brandService.save(brand);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * @Description(修改品牌)
     * @Param: []
     * @return: boolean
     * @Date: 2019/6/15
     */
    @PostMapping("/update")
    public boolean update(@RequestBody Brand brand) {
        try {
            brandService.update(brand);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
    * @Description(分页查询品牌)
    * @Param: [page, rows]
    * @return: PageResult
    * @Date: 2019/6/15
    */
    @GetMapping("/findByPage")
    public PageResult findByPage(Integer page, Integer rows) {
        return brandService.findByPage(null, page, rows);
    }
}
