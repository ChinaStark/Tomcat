package com.Luv.Map;

import com.Luv.pojo1.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select({"select * from student"})
    List<Student> selectAll();

    @Select("select count(*) from t_use where useName = #{user} and password = #{pwd}")
    int IsUser(@Param("user")String name,@Param("pwd")String pwd);
    @Insert("insert into t_use values (#{user} , #{pwd})")
    void Add(@Param("user")String name,@Param("pwd")String pwd);



    @Delete("delete from student where student_id = #{id}")
    int Deleteone(@Param("id")int id);

    @Insert("insert into student (student_id, sname, sage, grade, region) VALUES (#{stu.student_id},#{stu.sname},#{stu.sage},#{stu.grade},#{stu.region})")
    int Addstudent(@Param("stu")Student stu);
    //    int Add(@Param("student_id")String student_id,@Param("sname")String sname,@Param("sage") int sage ,@Param("grade")int grade , @Param("region")int region)
    @Update("update studene set  =  where ;")
    int updata();
    
}
