package com.example.springbootstudy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "FID")
    private Integer fid;

    /**
     * 用户名
     */
    @Column(name = "Fname")
    private String fname;

    /**
     * 用户密码
     */
    @Column(name = "Fpassword")
    private String fpassword;

    /**
     * 创建时间
     */
    @Column(name = "FcreatDate")
    private Date fcreatdate;

    /**
     * 修改时间
     */
    @Column(name = "FmodifyDate")
    private Date fmodifydate;

    /**
     * 获取用户ID
     *
     * @return FID - 用户ID
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * 设置用户ID
     *
     * @param fid 用户ID
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * 获取用户名
     *
     * @return Fname - 用户名
     */
    public String getFname() {
        return fname;
    }

    /**
     * 设置用户名
     *
     * @param fname 用户名
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * 获取用户密码
     *
     * @return Fpassword - 用户密码
     */
    public String getFpassword() {
        return fpassword;
    }

    /**
     * 设置用户密码
     *
     * @param fpassword 用户密码
     */
    public void setFpassword(String fpassword) {
        this.fpassword = fpassword;
    }

    /**
     * 获取创建时间
     *
     * @return FcreatDate - 创建时间
     */
    public Date getFcreatdate() {
        return fcreatdate;
    }

    /**
     * 设置创建时间
     *
     * @param fcreatdate 创建时间
     */
    public void setFcreatdate(Date fcreatdate) {
        this.fcreatdate = fcreatdate;
    }

    /**
     * 获取修改时间
     *
     * @return FmodifyDate - 修改时间
     */
    public Date getFmodifydate() {
        return fmodifydate;
    }

    /**
     * 设置修改时间
     *
     * @param fmodifydate 修改时间
     */
    public void setFmodifydate(Date fmodifydate) {
        this.fmodifydate = fmodifydate;
    }
}