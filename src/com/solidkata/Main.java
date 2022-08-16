package com.solidkata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point a = new Point(1,2);
        Point b = new Point(2,5);

        Distance distance = new ManhattanDistance();

        System.out.println("Manhattan distance: "+ distance.calculateDistance(a,b));
    }
}
