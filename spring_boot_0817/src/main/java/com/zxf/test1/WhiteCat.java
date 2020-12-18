package com.zxf.test1;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("b")
public class WhiteCat implements Cat {
    @Override
    public String getName() {
        return "白猫";
    }
}
