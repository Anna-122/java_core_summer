package com.solution.goncharova;

public class Square extends Figure{

    int lengthOfOneSide;

    public Square( int lengthOfOneSide ) {
        this.lengthOfOneSide = lengthOfOneSide;
    }
    public Square( ) {
        this.lengthOfOneSide = 0;
    }

    public int getLengthOfOneSide() {
        return lengthOfOneSide;
    }

    @Override
    public void findFigureArea( ) {
        int s = this.lengthOfOneSide * this.lengthOfOneSide;
        System.out.println("The area of the square is " + s);
    }

    @Override
    public void changeSize( double x ) {
       double newValue1 = this.lengthOfOneSide * this.lengthOfOneSide * x;
       double newValue2 = this.lengthOfOneSide * this.lengthOfOneSide / x;
        System.out.println(" Increased square" + newValue1);
        System.out.println(" Decreased square" + newValue2);



    }
}
