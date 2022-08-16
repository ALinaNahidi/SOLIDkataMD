package com.solidkata;

public class Point implements PointDistance{
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int getMDistanceFrom(PointDistance p) {
        if(p instanceof Point){
            Point point = (Point) p;
            return Math.abs(point.x-x)+Math.abs(point.y-y);
        }
        throw new RuntimeException("Error while calculating Manhattan Distance");
    }
}
