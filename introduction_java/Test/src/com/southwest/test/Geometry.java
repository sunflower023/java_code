package com.southwest.test;

public class Geometry {
    protected int type = TYPE_GEOM;
    public static final int TYPE_GEOM = 0;
    public static final int TYPE_CIRCLE = 1;
    public static final int TYPE_RECTANGLE = 2;

    public int GetType(){
        return type;
    }
}
