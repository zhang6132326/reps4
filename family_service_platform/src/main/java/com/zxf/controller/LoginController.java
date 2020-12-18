package com.zxf.controller;
import com.alibaba.fastjson.JSONObject;
import com.zxf.bean.TblUserRecord;
import com.zxf.returnJson.Permission;
import com.zxf.returnJson.Permissions;
import com.zxf.returnJson.ReturnObject;
import com.zxf.returnJson.UserInfo;
import com.zxf.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        System.out.println("login调用了");
        TblUserRecord tblUserRecord=loginService.login(username,password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        //将用户数据写入到session中
        session.setAttribute("userRecord",tblUserRecord);
        System.out.println("**"+tblUserRecord+"**");
        ReturnObject  returnObject=new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(returnObject);
    }

    @RequestMapping("/user/info")
    public String getInfo(HttpSession session){
         TblUserRecord tblUserRecord=(TblUserRecord)session.getAttribute("userRecord");
        //获取模块信息
        String[] split=tblUserRecord.getTblRole().getRolePrivileges().split("-");
        //创建权限集合对象
        Permissions permissions=new Permissions();
        //向权限集合对象中添加具体的权限
        List<Permission> permissionsList=new ArrayList<>();
        for(String s:split){
            permissionsList.add(new Permission(s));
        }
        permissions.setPermissions(permissionsList);
        //设置返回值的result
        UserInfo userInfo=new UserInfo(tblUserRecord.getUserName(),permissions);
        return JSONObject.toJSONString(new ReturnObject(userInfo));
    }
    @RequestMapping("/auth/logout")
    public void logOut(HttpSession session){
        System.out.println("logout");
        session.invalidate();

    }














    @RequestMapping("/auth/2step-code")
    public Boolean test(){
        System.out.println("test()执行了。。。");
        return 4!=4;
    }
}