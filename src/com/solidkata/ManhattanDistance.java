package com.solidkata;

public class ManhattanDistance implements Distance{
    @Override
    public int calculateDistance(Point a, Point b) {
        return a.getMDistanceFrom(b);
    }
}
