package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order  {
    //编号@TableId
    private Long id;

    //产品编号
    private Long goodid;
    //金额
    private Long count;
    //创建人编号 当前用户ID
    private Long creatorid;
    //创建人姓名
    private String creatorname;
    //付款时间 默认为当前时间
    private Date createdate;
    //商品名称
    private String goodsname;
    //数据级别 选项：0=未付款 1=付款成功
    private Integer status;



}

