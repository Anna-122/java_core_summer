package com.solution.goncharova;

public abstract class Figure {

    double coordinate1;
    double coordinate2;

    public Figure( double coordinate1, double coordinate2 ) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }
    public Figure() {
        this.coordinate1 = 0;
        this.coordinate2 = 0;
    }

    public double getCoordinate1() {
        return coordinate1;
    }

    public double getCoordinate2() {
        return coordinate2;
    }

    public void findFigureArea(){

    }

    public void changeSize( double x ){

    }
}
