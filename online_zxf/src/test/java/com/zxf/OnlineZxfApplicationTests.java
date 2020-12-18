package com.zxf;

import com.zxf.model.entity.User;
import com.zxf.utils.JWTUtils;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnlineZxfApplicationTests {

    @Test
    void contextLoads() {

    }
    @Test
    public void testGenJwt(){
        User user=new User();
        user.setId(22);
        user.setName("zhangxuefengcctv");
        user.setHead_img("qq.jpg");
        String token= JWTUtils.geneJsonWebToken(user);
        System.out.println(token);
        //如果有效时间过了，这里就无法拿到秘钥，机会返回null了
        Claims claims=JWTUtils.chckJWT(token);
        System.out.println(claims.get("name"));

    }

}
