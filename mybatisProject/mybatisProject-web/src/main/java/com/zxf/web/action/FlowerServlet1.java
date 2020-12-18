package com.zxf.web.action;


import com.zxf.pojo.Flower;
import com.zxf.service.FlowerService;
import com.zxf.service.impl.FlowerServiceImpl;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.List;

public class FlowerServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FlowerService flowerService=new FlowerServiceImpl();
        List<Flower> list=flowerService.getAll();
        for(Flower f:list){
            System.out.println(f.getName());
        }



        request.setAttribute("lists",list);
        request.getRequestDispatcher("jsp/show1.jsp").forward(request,response);
    }
}
