package com.solution.goncharova;

public class Triangle extends Figure {

    int height;
    int baseLength;

    public Triangle( int height, int baseLength ) {
        this.height = height;
        this.baseLength = baseLength;
    }
    public Triangle(  ) {
        this.height = 0;
        this.baseLength = 0;
    }

    public int getHeight() {
        return height;
    }

    public int getBaseLength() {
        return baseLength;
    }

    @Override
    public void findFigureArea( ) {
        int s = (getHeight()*getBaseLength())/2;
        System.out.println("The area of the triangle is " + s);
    }

    @Override
    public void changeSize( double x ) {
        double newValue1 = (getHeight()*getBaseLength())/2 * x;
        double newValue2 = (getHeight()*getBaseLength())/2 / x;
        System.out.println(" Increased triangle" + newValue1);
        System.out.println(" Decreased triangle" + newValue2);
    }
}


