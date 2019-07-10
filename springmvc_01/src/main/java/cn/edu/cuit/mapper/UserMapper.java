package cn.edu.cuit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cuit.edu.cn.mybatis.entity.User;


public interface UserMapper {
    
			@Select("select count(*) from users where user_name=#{name} and user_pass=#{pass}")
			 public int findUserByNameAndPwd(@Param("name") String name,@Param("pass") String pass);


}
