package com.Luv.Server;

import com.Luv.Map.UserMapper;
import com.Luv.pojo1.Student;
import com.Luv.util.sqlFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class infoServe {
    public List<Student> SelectAll(){
        SqlSessionFactory factory = sqlFactory.getFactory();
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Student> list = mapper.selectAll();
        sqlSession.close();
        return list;
    }

    public void Add(String name ,String pwd) {
        SqlSessionFactory factory = sqlFactory.getFactory();
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.Add(name,pwd);
        sqlSession.commit();
        sqlSession.close();
    }
<<<<<<< HEAD
    public int delete(int id) {
        SqlSessionFactory factory = sqlFactory.getFactory();
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int p = mapper.Deleteone(id);
        sqlSession.commit();
        sqlSession.close();
        return p;
    }

    public int Addstudent(Student student) {
        SqlSessionFactory factory = sqlFactory.getFactory();
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int addstudent = mapper.Addstudent(student);
        sqlSession.commit();
        sqlSession.close();
        return addstudent;
    }

    public int Modify(Student student) {
        SqlSessionFactory factory = sqlFactory.getFactory();
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int addstudent = mapper.Addstudent(student);
        sqlSession.commit();
        sqlSession.close();
        return addstudent;
    }
=======
>>>>>>> origin/main
}
