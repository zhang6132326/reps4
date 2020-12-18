package com.zxf.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zxf.utils.JWTUtils;
import com.zxf.utils.JsonData;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class LoginInterceptor implements HandlerInterceptor {
    /*
         进入到Controller之前的方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            String accesToken = request.getHeader("token");
            if (accesToken == null) {
                accesToken = request.getParameter("token");
            }
            if (StringUtils.isNotBlank(accesToken)) {
                Claims claims = JWTUtils.chckJWT(accesToken);
                if (claims == null) {
                    //告诉登录过期，重新登录
                    sendJsonMessage(response, JsonData.buildError("error登录过期，重新登录"));
                    return false;
                }
                Integer id = (Integer) claims.get("id");
                String name = (String) claims.get("name");
                request.setAttribute("user_id", id);
                request.setAttribute("name", name);
                return true;

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        sendJsonMessage(response,JsonData.buildError("error登录过期，重新登录"));
            return false;
    }
    /*
        响应Json数据给前端
     */
    public static void sendJsonMessage(HttpServletResponse response,Object obj){
        try {
            ObjectMapper objectMapper=new ObjectMapper();
             response.setContentType("application/json;charset=utf-8");
            PrintWriter writer=response.getWriter();
            writer.println(objectMapper.writeValueAsBytes(obj));
            writer.close();
            response.flushBuffer();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
