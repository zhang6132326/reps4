package com.zxf.web.action;

import com.zxf.pojo.Account;
import com.zxf.service.AccountService;
import com.zxf.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {
    private AccountService accountService=new AccountServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
        Account accOut=new Account();
        accOut.setAccNo(req.getParameter("accOutAccNo"));
        accOut.setPassword(Integer.parseInt(req.getParameter("accOutPassword")));
        accOut.setBalance(Double.parseDouble(req.getParameter("accOutBalance")));
        Account accIn =new Account();
        accIn.setAccNo(req.getParameter("accInAccNo"));
        accIn.setName(req.getParameter("accInName"));
         String info=accountService.transfer(accIn,accOut);
         if(info.equals(AccountService.SUCCESS)){
             resp.sendRedirect("/show123");
         }else {
             HttpSession session=req.getSession();
             session.setAttribute("code",info);
             resp.sendRedirect("/error/error.jsp");
         }

    }
}
