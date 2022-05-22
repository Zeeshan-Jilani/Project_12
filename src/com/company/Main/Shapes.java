package com.company.Main;

public class Shapes {
    enum Figures{
        square,
        rectangle,
        circle,
        trapezoid,
        rhombus,
        triangle,
        oval,
        hexagon
    }
    static class Display{
        Figures m1 =  Figures.square;
        void changeShape(){
            switch(m1) {
                case square:
                    m1 = Shapes.Figures.rectangle;
                    break;
                case rectangle:
                    m1 = Shapes.Figures.circle;
                    break;
                case circle:
                    m1 = Shapes.Figures.trapezoid;
                    break;
                case trapezoid:
                    m1 = Shapes.Figures.rhombus;
                    break;
                case rhombus:
                    m1 = Shapes.Figures.triangle;
                    break;
                case triangle:
                    m1 = Shapes.Figures.oval;
                    break;
                case oval:
                    m1 = Shapes.Figures.hexagon;
                    break;
                case hexagon:
                    m1 = Shapes.Figures.square;
                    break;
            }

        }
        public String toString(){
            return ""+m1;
        }
    }
    public static void main(String[] args){
        Display m = new Display();
        for (int i = 0; i < 7 ; i++) {
            System.out.println(m);
            m.changeShape();

        }

    }


}

