package com.zxf.inters;

import java.lang.reflect.Method;

public interface Interceptors {
    public boolean before(Object proxy, Object target, Method method, Object[] args);

    public void around(Object proxy, Object target, Method method, Object[] args);

    public void after(Object proxy, Object target, Method method, Object[] args);
}
