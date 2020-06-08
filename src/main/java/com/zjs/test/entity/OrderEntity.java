package com.zjs.test.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tab_order`")
public class OrderEntity {
    @Id
    @Column(name = "`orderid`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;

    @Column(name = "`vipid`")
    private Integer vipid;

    @Column(name = "`vipname`")
    private String vipname;

    @Column(name = "`vipphone`")
    private String vipphone;

    @Column(name = "`vipaddress`")
    private String vipaddress;

    @Column(name = "`vipmoney`")
    private Double vipmoney;

    @Column(name = "`vipclass`")
    private String vipclass;

    @Column(name = "`vipdiscount`")
    private String vipdiscount;

    @Column(name = "`ordermoney`")
    private Double ordermoney;

    @Column(name = "`realmoney`")
    private Double realmoney;

    @Column(name = "`activityname`")
    private String activityname;

    @Column(name = "`receiptway`")
    private String receiptway;

    @Column(name = "`xianjin`")
    private String xianjin;

    @Column(name = "`employeeid`")
    private Integer employeeid;

    @Column(name = "`employeename`")
    private String employeename;

    @Column(name = "`operatorid`")
    private Integer operatorid;

    @Column(name = "`operator`")
    private String operator;

    @Column(name = "`writetime`")
    private Date writetime;

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
     * @return vipid
     */
    public Integer getVipid() {
        return vipid;
    }

    /**
     * @param vipid
     */
    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    /**
     * @return vipname
     */
    public String getVipname() {
        return vipname;
    }

    /**
     * @param vipname
     */
    public void setVipname(String vipname) {
        this.vipname = vipname == null ? null : vipname.trim();
    }

    /**
     * @return vipphone
     */
    public String getVipphone() {
        return vipphone;
    }

    /**
     * @param vipphone
     */
    public void setVipphone(String vipphone) {
        this.vipphone = vipphone == null ? null : vipphone.trim();
    }

    /**
     * @return vipaddress
     */
    public String getVipaddress() {
        return vipaddress;
    }

    /**
     * @param vipaddress
     */
    public void setVipaddress(String vipaddress) {
        this.vipaddress = vipaddress == null ? null : vipaddress.trim();
    }

    /**
     * @return vipmoney
     */
    public Double getVipmoney() {
        return vipmoney;
    }

    /**
     * @param vipmoney
     */
    public void setVipmoney(Double vipmoney) {
        this.vipmoney = vipmoney;
    }

    /**
     * @return vipclass
     */
    public String getVipclass() {
        return vipclass;
    }

    /**
     * @param vipclass
     */
    public void setVipclass(String vipclass) {
        this.vipclass = vipclass == null ? null : vipclass.trim();
    }

    /**
     * @return vipdiscount
     */
    public String getVipdiscount() {
        return vipdiscount;
    }

    /**
     * @param vipdiscount
     */
    public void setVipdiscount(String vipdiscount) {
        this.vipdiscount = vipdiscount == null ? null : vipdiscount.trim();
    }

    /**
     * @return ordermoney
     */
    public Double getOrdermoney() {
        return ordermoney;
    }

    /**
     * @param ordermoney
     */
    public void setOrdermoney(Double ordermoney) {
        this.ordermoney = ordermoney;
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

    /**
     * @return activityname
     */
    public String getActivityname() {
        return activityname;
    }

    /**
     * @param activityname
     */
    public void setActivityname(String activityname) {
        this.activityname = activityname == null ? null : activityname.trim();
    }

    /**
     * @return receiptway
     */
    public String getReceiptway() {
        return receiptway;
    }

    /**
     * @param receiptway
     */
    public void setReceiptway(String receiptway) {
        this.receiptway = receiptway == null ? null : receiptway.trim();
    }

    /**
     * @return xianjin
     */
    public String getXianjin() {
        return xianjin;
    }

    /**
     * @param xianjin
     */
    public void setXianjin(String xianjin) {
        this.xianjin = xianjin == null ? null : xianjin.trim();
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
     * @return operatorid
     */
    public Integer getOperatorid() {
        return operatorid;
    }

    /**
     * @param operatorid
     */
    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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