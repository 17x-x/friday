package edu.friday.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_user", schema = "friday")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @Basic
    @Column(name = "nick_Name")
    private String nickName;
    @Basic
    @Column(name = "user_Type")
    private String userType;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "phonenumber")
    private String phonenumber;
    @Basic
    @Column(name = "sex")
    private String sex;
    @Basic
    @Column(name = "avatar")
    private String avatar;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "del_Flag")
    private String delFlag;
    @Basic
    @Column(name = "login_Ip")
    private String loginIp;
    @Basic
    @Column(name = "login_Date")
    private Timestamp loginDate;
    @Basic
    @Column(name = "create_By")
    private String createBy;
    @Basic
    @Column(name = "create_Time")
    private Timestamp createTime;
    @Basic
    @Column(name = "update_By")
    private String updateBy;
    @Basic
    @Column(name = "update_Time")
    private Timestamp updateTime;
    @Basic
    @Column(name = "remark")
    private String remark;


}
