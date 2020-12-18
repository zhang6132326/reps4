package com.zxf.web.servlet;

import com.zxf.web.service.FlowerService;
import com.zxf.web.service.impl.FlowerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/flowerServlet")
public class FlowerServlet extends HttpServlet {
    private FlowerService flowerService;
    @Override
    public void init() throws ServletException {
        ApplicationContext ac= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        flowerService=ac.getBean("flowerSerivce", FlowerServiceImpl.class);
    }
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("list",flowerService.show());
        req.getRequestDispatcher("showFlower.jsp").forward(req,res);
    }
}
