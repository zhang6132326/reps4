package com.zxf.test1;


import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("a")
public class BlackCat implements Cat {
    @Override
    public String getName() {
        return "黑猫";
    }
}
