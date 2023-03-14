package org.example;

import java.util.Objects;

/**
 * Representa un objeto rectangulo que implementa las interfaces Draw y Shape
 * por lo tanto, está oblidada a implementar los métodos que estas definen.
 *
 */
public class Rectangle <T extends Number> implements Draw, Calculate, Cloneable, Comparable<Rectangle> {
    private T x1, x2, y1, y2;
    double area;

    public Rectangle (T x1, T x2, T y1, T y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /***
     * Sobreescribe los métodos definidos en la interfaz Draw
     */
    @Override
    public void paint () {
        String m = String.format ("Dibujando el rectangulo desde el punto (%d, %d) al punto (%d, %d)", x1, y1, x2, y2);
        System.out.println (m);
    }

    @Override
    public void fill () {
        System.out.println ("Rectángulo coloreado!");
    }
    /******/

    /**
     * Sobreescribe al método definido en la interfaz Shape
     */
    @Override
    public double calculateArea() {
        return x1.doubleValue() * y1.doubleValue();
    }

    @Override
    public int compareTo(Rectangle rect){
        return Double.compare(this.calculateArea(), rect.calculateArea());
    }
}