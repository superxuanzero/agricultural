package com.zero.agricultural.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport{

    private int id;                         //每一个实体类都有一个id

    private String provinceName;            //记录省份名字

    private int provinceCode;               //记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
