package com.zxf;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {
    Logger logger= LoggerFactory.getLogger(getClass());
    @Test
    public void test1(){
        //由低到高   trace<debug<info<warn<error
        /*
             spring默认级别是info 默认级别为root级别
             logging.level.com.zxf= error  通过配置文件设置改变spring的默认设置级别
                这个就只显示了error级别
                logging.level.com.zxf=trace
                 这样就从trace开始显示了所以级别的日志信息。

         */
        logger.trace("我是trace");
        logger.debug("我是debug");
        logger.info("我是info---");
        logger.warn("我是warn");
        logger.error("我是error");
    }
}
