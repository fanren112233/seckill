package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderInfo  {
    //编号@TableId
    private Long id;

    //用户id
    private Long userid;
    //商品id
    private Long goodsid;
    //额度
    private Integer goodsCount;
    //状态 0新建未支付，1已支付，2已退款，3已完成
    private Integer ststus;
    //商品名称
    private String goodsname;
    
    private Integer count;
    //创建时间
    private Date createdate;
    
    private String 字段21;



}

