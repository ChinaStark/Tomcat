package com.Luv.Map;

import com.Luv.pojo1.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select({"select * from student"})
    List<Student> selectAll();

    @Select("select count(*) from t_use where useName = #{user} and password = #{pwd}")
    int IsUser(@Param("user")String name,@Param("pwd")String pwd);
    @Insert("insert into t_use values (#{user} , #{pwd})")
    void Add(@Param("user")String name,@Param("pwd")String pwd);
}
