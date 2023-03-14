package org.example;

public class Main {

    public static void main (String [] args) {
        Circle circle1 = new Circle (10, 10, 20);
        Circle circle2 = new Circle (15, 15, 21);
        
        int resultCircles = circle1.compareTo (circle2);

        Rectangle rec1 = new Rectangle (10, 10, 20, 20);
        Rectangle rec2 = new Rectangle (30, 30, 50, 50);
        
        int resultRecs = rec1.compareTo (rec2);

        if(resultCircles<0){
            System.out.println("circle1 es menor a circle2");
        } else if (resultCircles>0) {
            System.out.println("circle1 es mayor a circle2");
        }
        else System.out.println("Ambos circulos tienen la misma area");

        if(resultRecs<0){
            System.out.println("rec1 es menor a rec2");
        }
        else if (resultRecs>0) {
            System.out.println("rec1 es mayor a rec2");
        }
        else System.out.println("Ambos rectangulos tienen la misma area");
    }

}







