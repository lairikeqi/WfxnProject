package com.zz.common.pojo;

import java.util.List;

/**
 * @author: Z.K
 * @create: 2019-06-15 15:34:17
 * @description: This is fen ye Result class! 分页结果实体类
 **/
public class PageResult {

    // 总记录数
    private long total;
    // 分页数据
    private List<?> rows;

    public PageResult() {
    }

    public PageResult(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total){
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
