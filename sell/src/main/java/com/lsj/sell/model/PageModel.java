package com.lsj.sell.model;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 重写分页实体
 * @author  huangrundong
 * @param <T>
 */

public class PageModel<T> implements IPage<T> {
    private List<T> records;
    private long total;
    private long size;
    private long current;
    private String[] ascs;
    private String[] descs;
    private boolean optimizeCountSql;
    private boolean isSearchCount;
    private long pages;
    //参数
    private Map<String,Object> params;
    public PageModel() {
        this.records = Collections.emptyList();
        this.total = 0L;
        this.size = 10L;
        this.current = 1L;
        this.optimizeCountSql = true;
        this.isSearchCount = true;
    }

    @Override
    public long getPages() {
        return pages;
    }


    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public PageModel(long current, long size) {
        this(current, size, 0L);
    }

    public PageModel(long current, long size, long total) {
        this(current, size, total, true);
    }

    public PageModel(long current, long size, boolean isSearchCount) {
        this(current, size, 0L, isSearchCount);
    }

    public PageModel(long current, long size, long total, boolean isSearchCount) {
        this.records = Collections.emptyList();
        this.total = 0L;
        this.size = 10L;
        this.current = 1L;
        this.optimizeCountSql = true;
        this.isSearchCount = true;
        if (current > 1L) {
            this.current = current;
        }

        this.size = size;
        this.total = total;
        this.isSearchCount = isSearchCount;
    }

    public boolean hasPrevious() {
        return this.current > 1L;
    }

    public boolean hasNext() {
        return this.current < this.getPages();
    }


    @Override
    public List<T> getRecords() {
        return this.records;
    }
    @Override
    public PageModel<T> setRecords(List<T> records) {
        this.records = records;
        return this;
    }
    @Override
    public long getTotal() {
        return this.total;
    }
    @Override
    public PageModel<T> setTotal(long total) {
        this.total = total;
        this.pages = (int) Math.ceil((double) total/(double) size);
        return this;
    }
    @Override
    public long getSize() {
        return this.size;
    }
    @Override
    public PageModel<T> setSize(long size) {
        size=size<=0?1:size;
        this.size = size;
        return this;
    }
    @Override
    public long getCurrent() {
        return this.current;
    }
    @Override
    public PageModel<T> setCurrent(long current) {
        this.current = current;
        return this;
    }
    @Override
    public String[] ascs() {
        return this.ascs;
    }

    public PageModel<T> setAscs(List<String> ascs) {
        if (CollectionUtils.isNotEmpty(ascs)) {
            this.ascs = (String[])ascs.toArray(new String[0]);
        }

        return this;
    }

    public PageModel<T> setAsc(String... ascs) {
        this.ascs = ascs;
        return this;
    }
    @Override
    public String[] descs() {
        return this.descs;
    }

    public PageModel<T> setDescs(List<String> descs) {
        if (CollectionUtils.isNotEmpty(descs)) {
            this.descs = (String[])descs.toArray(new String[0]);
        }

        return this;
    }

    public PageModel<T> setDesc(String... descs) {
        this.descs = descs;
        return this;
    }

    @Override
    public boolean optimizeCountSql() {
        return this.optimizeCountSql;
    }
    @Override
    public boolean isSearchCount() {
        return this.total < 0L ? false : this.isSearchCount;
    }

    public PageModel<T> setSearchCount(boolean isSearchCount) {
        this.isSearchCount = isSearchCount;
        return this;
    }

    public PageModel<T> setOptimizeCountSql(boolean optimizeCountSql) {
        this.optimizeCountSql = optimizeCountSql;
        return this;
    }
}
