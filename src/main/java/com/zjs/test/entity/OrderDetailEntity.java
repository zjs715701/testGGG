package com.zjs.test.entity;

import javax.persistence.*;

@Table(name = "`tab_orderdetail`")
public class OrderDetailEntity {
    @Id
    @Column(name = "`orderdetailid`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderdetailid;

    @Column(name = "`orderid`")
    private Integer orderid;

    @Column(name = "`productid`")
    private Integer productid;

    @Column(name = "`productname`")
    private String productname;

    @Column(name = "`productsize`")
    private String productsize;

    @Column(name = "`productcolor`")
    private String productcolor;

    @Column(name = "`productprice`")
    private Double productprice;

    @Column(name = "`buynum`")
    private Integer buynum;

    @Column(name = "`vipprice`")
    private Double vipprice;

    @Column(name = "`realmoney`")
    private Double realmoney;

    /**
     * @return orderdetailid
     */
    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    /**
     * @param orderdetailid
     */
    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    /**
     * @return orderid
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * @param orderid
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * @return productid
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * @param productid
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * @return productname
     */
    public String getProductname() {
        return productname;
    }

    /**
     * @param productname
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * @return productsize
     */
    public String getProductsize() {
        return productsize;
    }

    /**
     * @param productsize
     */
    public void setProductsize(String productsize) {
        this.productsize = productsize == null ? null : productsize.trim();
    }

    /**
     * @return productcolor
     */
    public String getProductcolor() {
        return productcolor;
    }

    /**
     * @param productcolor
     */
    public void setProductcolor(String productcolor) {
        this.productcolor = productcolor == null ? null : productcolor.trim();
    }

    /**
     * @return productprice
     */
    public Double getProductprice() {
        return productprice;
    }

    /**
     * @param productprice
     */
    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    /**
     * @return buynum
     */
    public Integer getBuynum() {
        return buynum;
    }

    /**
     * @param buynum
     */
    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    /**
     * @return vipprice
     */
    public Double getVipprice() {
        return vipprice;
    }

    /**
     * @param vipprice
     */
    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }

    /**
     * @return realmoney
     */
    public Double getRealmoney() {
        return realmoney;
    }

    /**
     * @param realmoney
     */
    public void setRealmoney(Double realmoney) {
        this.realmoney = realmoney;
    }
}