package com.zxf.filter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zxf.domain.User;
import com.zxf.service.impl.UserServiceImpl;
import com.zxf.utils.JsonData;
import org.thymeleaf.util.StringUtils;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/api/v1/pri/*",filterName = "loginFilter")
public class LoginFilter  implements Filter {
    private static final ObjectMapper objectMapper=new ObjectMapper();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest)servletRequest;
        HttpServletResponse res=(HttpServletResponse) servletResponse;
        String token=req.getHeader("token");
        if(StringUtils.isEmpty(token)){
            token=req.getParameter("token");
        }

        if(!StringUtils.isEmpty(token)){

            //判断token是否合法
            User user= UserServiceImpl.sessionMap.get(token);
            if(user!=null){
                filterChain.doFilter(servletRequest,servletResponse);
            }else {
                JsonData jsonData=JsonData.buildError("登录失败，token无效",-2);
                String jsonStr=objectMapper.writeValueAsString(jsonData);
                renderJson(res,jsonStr);
            }
        }else {
            JsonData jsonData=JsonData.buildError("未登录",-3);
            String jsonStr=objectMapper.writeValueAsString(jsonData);
            renderJson(res,jsonStr);
        }

        System.out.println("doFilter");
    }
    private void renderJson(HttpServletResponse response,String json){
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        try(PrintWriter writer=response.getWriter()){
            writer.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
