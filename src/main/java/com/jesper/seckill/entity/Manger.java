package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Manger  {
    //编号@TableId
    private Integer id;

    //密码
    private String password;
    //创建日期 默认为当前时间
    private Date createdate;
    //数据级别 选项：0=正常   -1=已删除 
    private Integer datalevel;
    //用户名
    private String usermane;



}

