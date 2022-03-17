package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Timelimit  {
    //编号@TableId
    private Integer id;

    //关联编号
    private Long userid;
    //金额
    private Long money;
    //创建日期 默认为当前时间
    private Date createdate;
    //数据级别 选项：0=正常 1=审核中 2=被否决 -1=已删除 -2=草稿
    private Integer datalevel;



}

