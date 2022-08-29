package com.Luv.web;
import com.Luv.Server.infoServe;
import org.apache.commons.io.IOUtils;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;


@WebServlet("/Demo2")
public class servletDemo2 extends HttpServlet {
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
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);

    }
}
