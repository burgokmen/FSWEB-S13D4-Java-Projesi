package com.brutech.main;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow((getX() - p.getX()), 2) + Math.pow((p.getY() - getY()), 2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow((getX() - a), 2) + Math.pow((getY() - b), 2));
    }

}
