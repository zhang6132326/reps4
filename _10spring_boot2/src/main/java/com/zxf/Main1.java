package com.zxf;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main1.class);
        logger.info("Hello World!!!!测试.");
        logger.error("abc");
        logger.debug("abc123");
    }
}
