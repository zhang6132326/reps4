package com.zxf.utils;

import com.zxf.model.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/*
    jwt工具
 */
public class JWTUtils {
    private static final long EXEPIRE=6000*60*24*7; //过期时间一周
     // private static final long EXEPIRE=1;
    private static final String  SECRET="z.x.fzhangxuefeng";//加密的秘钥
    private static final String TOKEN_PREFIX="zxf";//令牌前缀
    private static final String SUBJECT="zhangxf";//主题

     /*
        根据用户信息，生成令牌
      */
      public static String geneJsonWebToken(User user){
          String token=Jwts.builder().
                  setSubject(SUBJECT).
                  claim("head_img",user.getHead_img()).
                  claim("id",user.getId()).
                  claim("name",user.getName()).
                  setIssuedAt(new Date()).
                  setExpiration(new Date(System.currentTimeMillis()+EXEPIRE)).
                  signWith(SignatureAlgorithm.HS256,SECRET).compact();
           token=TOKEN_PREFIX+token;
          return token;
      }
      /*
          校验token
       */
      public static Claims chckJWT(String token){
          try{
              final Claims claims=Jwts.parser().setSigningKey(SECRET).
                      parseClaimsJws(token.replace(TOKEN_PREFIX,"")).
                      getBody();
              return claims;
          }catch (Exception e){
              return null;
          }
      }
}
