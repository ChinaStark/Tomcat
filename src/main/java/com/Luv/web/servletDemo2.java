package com.Luv.web;
<<<<<<< HEAD
import com.Luv.Server.infoServe;
=======
>>>>>>> origin/main
import org.apache.commons.io.IOUtils;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import java.io.BufferedReader;
=======
>>>>>>> origin/main
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;


@WebServlet("/Demo2")
public class servletDemo2 extends HttpServlet {
<<<<<<< HEAD
    private final com.Luv.Server.infoServe infoServe = new infoServe();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        System.out.println(s);
        int i = Integer.parseInt(s);
        System.out.println(i);
        infoServe.delete(i);
        resp.getWriter().write("Success");
=======
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if("POST".equals(req.getMethod())){
            req.setCharacterEncoding("UTF-8");//防止中文乱码POST
        }

        Map<String, String[]> parameterMap = req.getParameterMap();
        resp.setHeader("content-type","text/html;charset = UTF-8");
        String name = parameterMap.get("username")[0];
        //byte[] bytes = name.getBytes(StandardCharsets.ISO_8859_1);//防止中文乱码GET
        //String username_1 = new String(bytes, StandardCharsets.UTF_8);
        FileInputStream fis = new FileInputStream("D:\\奇点\\Documents\\Web\\Javascript_1.html");
        ServletOutputStream os = resp.getOutputStream();
        IOUtils.copy(fis,os);
        fis.close();

        //resp.getWriter().write("<h1>"+name+",Welcome </h1><br> you just a stupid !!!<br> <a>you password will be stolen by us</a> " );
        System.out.println(name);
        for(String key : parameterMap.keySet()){
            System.out.print(key+":");
            String[] strings = parameterMap.get(key);
            for (String a: strings
                 ) {
                System.out.print( a + " ");
            }
            System.out.println();
        }

>>>>>>> origin/main
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);

    }
}
