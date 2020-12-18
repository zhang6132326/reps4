package com.zxf.web.action;


import com.zxf.pojo.PageInfo;
import com.zxf.service.FlowerService;
import com.zxf.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/page")
public class ShowPageServlet extends HttpServlet {
       private FlowerService flowerService=new FlowerServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //第一次访问的验证,如果没有传递参数,设置默认值
        String pageSizeStr=request.getParameter("pageSize");
        int pageSize=15;
        if(pageSizeStr!=null && pageSizeStr.equals("")){
            pageSize=Integer.parseInt(pageSizeStr);
        }
        String pageNumberStr=request.getParameter("pageNumber");
        int pageNumber=1;
        if(pageNumberStr!=null&&!pageNumberStr.equals("")){
            pageNumber = Integer.parseInt(pageNumberStr);
        }
        PageInfo pi = flowerService.showPage(pageSize, pageNumber);
        request.setAttribute("PageInfo",pi);
        request.getRequestDispatcher("jsp/show2.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
