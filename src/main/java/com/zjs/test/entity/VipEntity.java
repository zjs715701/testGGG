package com.zjs.test.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tab_vip`")
public class VipEntity {
    @Id
    @Column(name = "`vipid`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vipid;

    @Column(name = "`vipname`")
    private String vipname;

    @Column(name = "`vipsex`")
    private String vipsex;

    @Column(name = "`vipphone`")
    private String vipphone;

    @Column(name = "`vipbirth`")
    private Date vipbirth;

    @Column(name = "`joinviptime`")
    private Date joinviptime;

    @Column(name = "`initegralnum`")
    private Integer initegralnum;

    @Column(name = "`vipmoney`")
    private Double vipmoney;

    @Column(name = "`vipstate`")
    private String vipstate;

    @Column(name = "`vipcardid`")
    private Integer vipcardid;

    @Column(name = "`employeeid`")
    private Integer employeeid;

    @Column(name = "`employeename`")
    private String employeename;

    @Column(name = "`writetime`")
    private Date writetime;

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
     * @return vipsex
     */
    public String getVipsex() {
        return vipsex;
    }

    /**
     * @param vipsex
     */
    public void setVipsex(String vipsex) {
        this.vipsex = vipsex == null ? null : vipsex.trim();
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
     * @return vipbirth
     */
    public Date getVipbirth() {
        return vipbirth;
    }

    /**
     * @param vipbirth
     */
    public void setVipbirth(Date vipbirth) {
        this.vipbirth = vipbirth;
    }

    /**
     * @return joinviptime
     */
    public Date getJoinviptime() {
        return joinviptime;
    }

    /**
     * @param joinviptime
     */
    public void setJoinviptime(Date joinviptime) {
        this.joinviptime = joinviptime;
    }

    /**
     * @return initegralnum
     */
    public Integer getInitegralnum() {
        return initegralnum;
    }

    /**
     * @param initegralnum
     */
    public void setInitegralnum(Integer initegralnum) {
        this.initegralnum = initegralnum;
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
     * @return vipstate
     */
    public String getVipstate() {
        return vipstate;
    }

    /**
     * @param vipstate
     */
    public void setVipstate(String vipstate) {
        this.vipstate = vipstate == null ? null : vipstate.trim();
    }

    /**
     * @return vipcardid
     */
    public Integer getVipcardid() {
        return vipcardid;
    }

    /**
     * @param vipcardid
     */
    public void setVipcardid(Integer vipcardid) {
        this.vipcardid = vipcardid;
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