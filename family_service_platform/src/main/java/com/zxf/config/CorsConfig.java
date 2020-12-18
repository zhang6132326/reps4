package com.zxf.config;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

public class CorsConfig {
    /*
    private CorsConfiguration buildConfig(){
        CorsConfiguration corsConfiguration=new CorsConfiguration();
        //设置属性
        //允许跨域请求的地址，*表示所有
        corsConfiguration.addAllowedOrigin("*");
        //配置跨域的请求头
        corsConfiguration.addAllowedHeader("*");
        //配置跨域的请求方法
        corsConfiguration.addAllowedMethod("*");
        // 表示跨域请求的时候是否使用的是同一个session
        corsConfiguration.setAllowCredentials(true);


        return corsConfiguration;
    }

    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter(source);
    }

     */
}
