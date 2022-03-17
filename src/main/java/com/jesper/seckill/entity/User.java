package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User  {
    //身份证号
    private String idcard;
    
    private Long mobile;
    //余额
    private Double money;
    //工作类型 1=有工作 0=没工作
    private Integer worktype;
    //姓名
    private String name;
    //名称
    private String username;
    //注释
    private String password;
    //混淆盐
    private String salt;
    //性别
    private Integer sex;
    //逾期次数
    private Integer timeoutcount;
    //失信 0=诚信 1=失信
    private Integer isrefuse;
    //创建日期 默认为当前时间
    private Date registerdate;
    //数据级别 选项：0=正常 -1=已删除
    private Integer datalevel;



}

