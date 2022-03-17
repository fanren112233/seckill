package com.jesper.seckill.Controller;

import com.jesper.seckill.service.UserService;
import com.jesper.seckill.vo.LoginVo;
import com.jesper.seckill.vo.RegiestVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class RefgiestUser {
    @Autowired
    UserService userService;

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/regiest")
    public String regiest(){
        return "regiest";
    }

    @RequestMapping("do_regiest")
    public String regiest(HttpServletResponse response, @Valid RegiestVo regiestVo){
        log.info(regiestVo.toString());
        if (userService.regiest(response, regiestVo)){
            return "login";
        }else {
            throw new RuntimeException("注册失败");
        }
    }
}
