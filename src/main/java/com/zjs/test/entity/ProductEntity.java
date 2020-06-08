package com.zjs.test.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tab_product`")
public class ProductEntity {
    @Id
    @Column(name = "`productid`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productid;

    @Column(name = "`productname`")
    private String productname;

    @Column(name = "`typeid`")
    private Integer typeid;

    @Column(name = "`productsize`")
    private String productsize;

    @Column(name = "`productcolor`")
    private String productcolor;

    @Column(name = "`productprice`")
    private Double productprice;

    @Column(name = "`producter`")
    private String producter;

    @Column(name = "`productstate`")
    private String productstate;

    @Column(name = "`employeeid`")
    private Integer employeeid;

    @Column(name = "`employeename`")
    private String employeename;

    @Column(name = "`writetime`")
    private Date writetime;

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
     * @return typeid
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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
     * @return producter
     */
    public String getProducter() {
        return producter;
    }

    /**
     * @param producter
     */
    public void setProducter(String producter) {
        this.producter = producter == null ? null : producter.trim();
    }

    /**
     * @return productstate
     */
    public String getProductstate() {
        return productstate;
    }

    /**
     * @param productstate
     */
    public void setProductstate(String productstate) {
        this.productstate = productstate == null ? null : productstate.trim();
    }

    /**
     * @return employeeid
     */
    public Integer getEmployeeid() {
        return employeeid;
    }

    /**
     * @param employeeid
     */
    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    /**
     * @return employeename
     */
    public String getEmployeename() {
        return employeename;
    }

    /**
     * @param employeename
     */
    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    /**
     * @return writetime
     */
    public Date getWritetime() {
        return writetime;
    }

    /**
     * @param writetime
     */
    public void setWritetime(Date writetime) {
        this.writetime = writetime;
    }
}