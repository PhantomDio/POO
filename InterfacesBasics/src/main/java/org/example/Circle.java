package org.example;

import java.util.Objects;

/**
 * Representa un objeto circulo que implementa las interfaces Draw y Shape
 * por lo tanto, está oblidada a implementar los métodos que estas definen
 *
 */
public class Circle <T extends Number> implements Draw, Calculate, Comparable<Circle>{
    T radio, x, y;
    public Circle(T radio, T x, T y){
        this.radio = radio;
    }

    /***
     * Sobreescribe los métodos definidos en la interfaz Draw
     */
    @Override
    public void paint () {
        System.out.println ("Círculo dibujado con centro en (" + this.x + ", " + this.y + ") y radio de " + this.radio);
    }

    @Override
    public void fill () {
        System.out.println ("Círculo coloreado!");
    }
    /****/

    /**
     * Sobreescribe al método definido en la interfaz Shape
     */
    @Override
    public double calculateArea () {
        return Math.pow(this.radio.doubleValue(), 2)*Math.PI;
    }
    @Override
    public int compareTo(Circle cir){
        return Double.compare(this.calculateArea(), cir.calculateArea());
    }
}