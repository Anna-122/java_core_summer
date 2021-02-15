package com.solution.goncharova;

import java.util.Random;

public class Main {
    public static void main( String[] args ) {
//        Circle circle1 = new Circle(4);
//        circle1.findFigureArea();
//
//        Triangle triangle1 = new Triangle(15,13);
//        triangle1.findFigureArea();
//
//        Square square1 = new Square(10);
//        square1.findFigureArea();

        Figure[] figureArr = new Figure[10];
        Figure figure = null;
        // Random random = new Random();

        for (int i = 0; i < 10; i++) {

            int randomNum = 1 + (int) (Math.random() * 3);
            switch (randomNum) {

                case 1: {
                    figure = new Circle((int) (Math.random() * 100));
                    figure.findFigureArea();
                    break;
                }
                case 2: {
                    figure = new Square((int) (Math.random() * 100));
                    figure.findFigureArea();
                    break;
                }
                case 3: {

                    figure = new Triangle((int) (Math.random() * 100), (int) (Math.random() * 100));
                    figure.findFigureArea();
                    break;
                }
            }

            // figureArr[i] = figure;
            System.out.println(figureArr[i].getClass().getName());
        }

        double randomKof = (Math.random() * 100);
        double[] result = new double[10];
        for (int i = 0; i < 10; i++) {
            figureArr[i].changeSize(randomKof);
            // result[i] = figureArr[i].findFigureArea();
        }
    }
}



//        case 1:
//                figure = new Circle((int) (Math.random()*100));
//
//                break;
//                case 2:
//                figure = new Square((int) (Math.random()*100));
//                break;
//                case 3:
//                figure = new Triangle((int) (Math.random()*100),(int) (Math.random()*100));
//                break;
//                }

