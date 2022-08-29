package com.Luv.web;

import com.Luv.Map.UserMapper;
import com.Luv.util.sqlFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Demo")
public class servletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("GET info...");
        session.setAttribute("username", request.getParameter("username"));
        session.setAttribute("password", request.getParameter("password"));
        //session.setAttribute("msg","1");
        response.sendRedirect("http://localhost:8080/TomcatDemo/info.html");
    }

//        HttpSession session = request.getSession();
//        SqlSessionFactory factory = sqlFactory.getFactory();
//        SqlSession sqlSession = factory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        //获取数据\
//        System.out.println("get...");
//        String username = new String(request.getParameter("username").getBytes("iso-8859-1"), "utf-8");
//        String password =  request.getParameter("password");
//        System.out.println("username" + username);
//        System.out.println("password" + password);
//
//        int isUser = mapper.IsUser(username, password);
//        System.out.println("isUser");
//
//
//        sqlSession.close();
//
//
//        if(isUser == 1){
//            request.getRequestDispatcher("/info/info.html").forward(request,response);
//        }
//        System.out.println(request.getParameter("password"));//测试代码
//        System.out.println("Filter...");
//    }
}