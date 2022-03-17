package com.jesper.seckill.entity;

import java.util.Date;


import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Goods  {
    //编号@TableId
    private Long id;

    //名称
    private String goodsTitle;
    //注释
    private String goodsName;
    //产品介绍
    private String goodsDetail;
    //费率
    private Double rate;
    //创建人编号 创建人id
    private Integer creatorid;
    //创建日期 默认为当前时间
    private Date createdate;
    //更新日期
    private Date updatetime;
    //数据级别 选项：0=正常 -1=已删除
    private Integer datalevel;
    //产品图片
    private Object goodsImg;



}

