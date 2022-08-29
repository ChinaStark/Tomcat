package com.Luv.web;

import com.Luv.Server.infoServe;
import com.Luv.pojo1.Student;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;


@WebServlet("/Add")
public class servletAdd extends HttpServlet {
    private final com.Luv.Server.infoServe infoServe = new infoServe();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        String decodeJson = URLDecoder.decode(s,"UTF-8");
        Student student = JSON.parseObject(decodeJson, Student.class);
        System.out.println(decodeJson);
        System.out.println(student.toString());
        int addstudent = infoServe.Addstudent(student);
        if(addstudent == 1){
            resp.getWriter().write("Success");
        }else {
            resp.getWriter().write("Fails");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);

    }
}
