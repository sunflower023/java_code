package com.southwest.test;

public class Rectangle {
    private double width;
    private double height;
    private double centerX;
    private double centerY;
    private double angle;
    public static final int VERTEX0 = 0;
    public static final int VERTEX1 = 1;
    public static final int VERTEX2 = 2;
    public static final int VERTEX3 = 3;

    public Rectangle(double centerX, double centerY,double width, double height) {
        this.width = width;
        this.height = height;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void move(double dx, double dy){
        centerX += dx;
        centerY += dy;
    }

    public void moveTo(double x,double y){
        centerX = x;
        centerY = y;
    }

    public void rotate(double angle){
        this.angle += angle;
        this.angle %= 360;
    }
}
