package com.solution.goncharova;

public class Circle extends Figure {
    public static final float PI = (float) 3.14159;
    int radius;

    public Circle( int radius ) {
        this.radius = radius;
    }
    public Circle( ) {
        this.radius = 0;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void findFigureArea( ) {
        float s = PI * this.radius * this.radius;
        System.out.println("The area of the circle is " + s);

    }

    @Override
    public void changeSize( double x ) {
        double newValue1 = this.radius * x;
        double newValue2 = this.radius / x;
        float s1 = (float) (PI * newValue1 * newValue1);
        System.out.println("Increased circle" + s1);
        float s2 = (float) (PI * newValue2 * newValue2);
        System.out.println("Decreased circle" + s2);

    }





    }

