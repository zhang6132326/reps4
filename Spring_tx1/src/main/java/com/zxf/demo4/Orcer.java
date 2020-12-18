package com.zxf.demo4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Orcer {

    @Value("苏家屯子")
    private String address;

    @Override
    public String toString() {
        return "Orcer{" +
                "address='" + address + '\'' +
                '}';
    }
}
