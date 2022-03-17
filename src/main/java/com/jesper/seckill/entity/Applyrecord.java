package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Applyrecord  {
    //编号@TableId
    private Integer id;

    //状态 选项  0=成功 1=失败
    private Integer status;
    //年龄
    private Integer age;
    //创建人编号 当前用户ID
    private Integer creatorid;
    //创建人姓名
    private String creatorname;
    //创建日期 默认为当前时间
    private Date createdate;
    //用户编号
    private Integer userid;



}

