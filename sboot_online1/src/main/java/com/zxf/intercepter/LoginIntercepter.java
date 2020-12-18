package com.zxf.intercepter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zxf.domain.User;
import com.zxf.service.impl.UserServiceImpl;
import com.zxf.utils.JsonData;
import org.attoparser.prettyhtml.PrettyHtmlMarkupHandler;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class LoginIntercepter implements HandlerInterceptor {
    private static final ObjectMapper objectMapper=new ObjectMapper();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginIntercepter preHandle =====");
        /*
        String token=request.getHeader("token");
        if(StringUtils.isEmpty(token)){
            token=request.getParameter("token");
        }
        if(!StringUtils.isEmpty(token)){
            //判断token是否合法
            User user= UserServiceImpl.sessionMap.get(token);
            if(user!=null){
                return true;
            }else {
                JsonData jsonData=JsonData.buildError("登录失败，token无效",-2);
                String jsonStr=objectMapper.writeValueAsString(jsonData);
                renderJson(response,jsonStr);
                return false;
            }
        }else {
            JsonData jsonData=JsonData.buildError("未登录",-3);
            String jsonStr=objectMapper.writeValueAsString(jsonData);
            return false;
        }

         */
       return HandlerInterceptor.super.preHandle(request,response,handler);
    }
    private void renderJson(HttpServletResponse response,String json){
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        try (PrintWriter writer=response.getWriter()){
            writer.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoginIntercepter postHandle =====");
        HandlerInterceptor.super.postHandle(request,response,handler,modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("LoginIntercepter afterCompletion =====");
        HandlerInterceptor.super.afterCompletion(request,response,handler,ex);
    }
}
