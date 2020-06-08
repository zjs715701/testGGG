package com.zjs.test.entity;

import javax.persistence.*;

@Table(name = "`tab_account`")
public class AccountEntity {
    @Id
    @Column(name = "`accountid`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountid;

    @Column(name = "`employeeid`")
    private Integer employeeid;

    @Column(name = "`username`")
    private String username;

    @Column(name = "`password`")
    private String password;

    @Column(name = "`accountstate`")
    private String accountstate;

    /**
     * @return accountid
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * @param accountid
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return accountstate
     */
    public String getAccountstate() {
        return accountstate;
    }

    /**
     * @param accountstate
     */
    public void setAccountstate(String accountstate) {
        this.accountstate = accountstate == null ? null : accountstate.trim();
    }
}