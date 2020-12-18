package com.zxf.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.UUID;

public class Main2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main2.class);
          logger.info("hello");
          logger.debug("abc123");
          logger.error("java123");
          logger.info(""+new Random().nextLong());
          logger.info(UUID.randomUUID().toString());
          logger.info(""+new Random().nextInt());
    }
}
