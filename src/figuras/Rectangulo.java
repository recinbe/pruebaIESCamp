/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Rebeca Cintas
 */
public class Rectangulo {
    private double a;
    private double b;

    public Rectangulo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double obtenerArea(){
    return a*b;
    }
    
}
