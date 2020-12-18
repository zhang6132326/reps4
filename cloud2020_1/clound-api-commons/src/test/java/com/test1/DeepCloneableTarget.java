package com.test1;

import java.io.*;

public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID=1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }




}