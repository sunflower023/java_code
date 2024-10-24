package com.southwest.test;

public class Retangle extends Geometry{
    {
        this.type = TYPE_RECTANGLE;
    }
    private double width,height;
    public double GetWidth(){
        return width;
    }
    public double GetHeight(){
        return height;
    }
    public void SetWidth(double width){
        this.width = width;
    }
    public void SetHeight(double height){
        this.height = height;
    }



}
