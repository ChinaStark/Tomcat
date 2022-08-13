package com.Luv.web;

import com.Luv.Map.UserMapper;
import com.Luv.Server.infoServe;
import com.Luv.pojo1.Student;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@WebServlet("/Demo3")
public class selectAllServlet extends HttpServlet {

    private final infoServe infoServe = new infoServe();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


        //获取sqlsession，用来执行sql语句
        List<Student> students = infoServe.SelectAll();
        System.out.println("implement sql...");

        String jsonString = JSON.toJSONString(students);
        res.setContentType("text/json;charset = utf-8");
        res.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        this.doGet(req,res);

    }
}
