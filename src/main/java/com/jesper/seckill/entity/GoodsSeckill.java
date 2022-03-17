package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GoodsSeckill  {
    //编号@TableId
    private Integer id;

    //商品id
    private Long goodsid;
    //额度 -1=无限 默认=0
    private Integer count;
    //开始时间
    private Date startDate;
    //结束时间
    private Date endtime;
    //并发版本控制
    private Integer version;
    //数据级别  0=正常  -1=已删除
    private Integer datalevel;



}

