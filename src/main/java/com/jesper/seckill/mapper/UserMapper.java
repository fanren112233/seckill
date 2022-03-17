package com.jesper.seckill.mapper;


import com.jesper.seckill.entity.User;
import com.jesper.seckill.vo.RegiestVo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where mobile = #{id}")
    public User getById(@Param("id")long id);

    @Update("update t_user set password = #{password} where id = #{id}")
    public void update(User toBeUpdate);

    @Insert("insert into t_user (mobile,idcard,Name,username,password) values(#{mobile},#{idcard},#{Name},#{username},#{password}) ")
    public void regiest(RegiestVo regiestVo);

    @Select("select idCard from t_user where mobile = #{id} ")
    public String getMobileExist(@Param("id")String id);

}
