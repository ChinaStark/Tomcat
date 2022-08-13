package com.Luv.web;

import com.Luv.Map.UserMapper;
import com.Luv.util.sqlFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

@WebFilter("/info.html")
public class FilterDemo1 implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("built");
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;

        HttpSession session = request1.getSession();
        SqlSessionFactory factory = sqlFactory.getFactory();
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //获取数据

        System.out.println("get...");
        Object u = session.getAttribute("username");
        Object p =  session.getAttribute("password");
        if(u == null || p == null){
            sqlSession.close();
            response1.sendRedirect("http://localhost:8080/TomcatDemo/login/login.html");
            return;
        }
        String password = p.toString();
        String username = new String(u.toString().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        int isUser = mapper.IsUser(username, password);
        System.out.println("isUser");


        sqlSession.close();


        if(isUser == 1){
            chain.doFilter(request, response);
        }else {
            session.setAttribute("msg","0");
            response1.sendRedirect("http://localhost:8080/TomcatDemo/login/login.html");
        }
        System.out.println(request.getParameter("password"));//测试代码
        System.out.println("Filter...");


    }
}
