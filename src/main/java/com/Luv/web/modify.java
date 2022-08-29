package com.Luv.web;

import com.Luv.Server.infoServe;
import com.Luv.pojo1.Student;
import com.Luv.pojo1.User;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet( "/Modify")
public class modify extends HttpServlet {
    private final com.Luv.Server.infoServe infoServe = new infoServe();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        Student student = JSON.parseObject(s, Student.class);

        resp.getWriter().write("Success");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
