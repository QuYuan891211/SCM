package cn.qy.scm.entity;

import java.io.Serializable;
import java.util.List;

public class Pagination<T> implements Serializable {
    private static final long serialVersionUID = 6621708557409749822L;
    private Integer totalNum;
    private Integer rows = 10;
    private Integer page = 1;
    private List<T> entityList;
    private T paramEntity;
    private String keywords;
    private Integer startNext;

    @Override
    public String toString() {
        return "Page [rows=" + rows + ", totalNum=" + totalNum + ", startNext=" + startNext
                + ", paramEntity=" + paramEntity + ", keywords=" + keywords
                + ", entityList=" + entityList + ", page = "+page+"]";
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }


    public List<T> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<T> entityList) {
        this.entityList = entityList;
    }

    public T getParamEntity() {
        return paramEntity;
    }

    public void setParamEntity(T paramEntity) {
        this.paramEntity = paramEntity;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getStartNext() {
        return startNext;
    }

    public void setStartNext() {
        this.startNext = (page-1)*rows;
    }
}
