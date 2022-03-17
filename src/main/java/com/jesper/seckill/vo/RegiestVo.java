package com.jesper.seckill.vo;

import com.jesper.seckill.validator.IsMobile;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegiestVo {

    @NotNull
    @IsMobile  //因为框架没有校验手机格式注解，所以自己定义
    private String mobile;

    private Long idCard;

    private Integer WorkType;

    private String name;

    private String username;

    private String passWord;

    private Integer sex;


}
