package com.wisdom.sound.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @program: sound-parent
 * @package: com.wisdom.sound.entity
 * @description: www.wisdom.com
 * @author: liuwisdom
 * @create: 2022-03-05 16:43
 * @company: PJ chain
 **/
public class PageResult implements Serializable {
    private long total;//总记录数
    private List rows;//当前页记录

    public PageResult(long total, List rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List getRows() {
        return rows;
    }
    public void setRows(List rows) {
        this.rows = rows;
    }
}
