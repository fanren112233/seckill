package com.jesper.seckill;

import com.jesper.seckill.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class someThingTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test1(){
        System.out.println(userMapper.getMobileExist("14963798710"));

    }

}
