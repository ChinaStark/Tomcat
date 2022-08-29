package com.Luv.web;

import com.Luv.Server.infoServe;
import com.Luv.pojo1.User;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet( "/register")
public class servletDemo1 extends HttpServlet {
    private final com.Luv.Server.infoServe infoServe = new infoServe();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String s = reader.readLine();

        User user = JSON.parseObject(s, User.class);
        System.out.println(user.getPwd());
        infoServe.Add(user.getName(),user.getPwd());
        resp.getWriter().write("Success");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
