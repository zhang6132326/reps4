package com.zxf.web.action;

import com.zxf.pojo.PageInfo;
import com.zxf.service.LogService;
import com.zxf.service.impl.LogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show123")
public class ShowServlet extends HttpServlet {
       private LogService logService=new LogServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int pageSize = 2;
        String pageSizeStr = req.getParameter("pageSize");
        if(pageSizeStr!=null&&!pageSizeStr.equals("")){
            pageSize = Integer.parseInt(pageSizeStr);
        }
        int pageNumber = 1;
        String pageNumberStr = req.getParameter("pageNumber");
        if(pageNumberStr!=null&&!pageNumberStr.equals("")){
            pageNumber = Integer.parseInt(pageNumberStr);
        }
        PageInfo pageInfo = logService.showPage(pageSize, pageNumber);
        System.out.println(pageInfo.getList().size()+"*******************");
        req.setAttribute("pageinfo", pageInfo);

        req.getRequestDispatcher("/bank/log.jsp").forward(req, resp);
    }
}
