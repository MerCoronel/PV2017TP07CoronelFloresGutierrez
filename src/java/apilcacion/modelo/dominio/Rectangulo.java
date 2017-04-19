/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apilcacion.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author merco_000
 */
public class Rectangulo {
    private double altura;
    private double base;
    private Punto A, B, C, D;
    
    public Rectangulo() {
    }
    public Rectangulo( Punto A, Punto B, Punto C, Punto D) {

        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    
    
 public ArrayList<Punto> EncontrarNuevoPunto(Punto a, double base, double altura){
     setA(a);
     setBase(base);
     setAltura(altura);
     ArrayList<Punto> puntos = new ArrayList();
     setB( new Punto
     (getA().getX()+getBase(),getA().getY()));
     setC( new Punto
     (getA().getX()+getBase(),getA().getY()+getAltura()));
     setD( new Punto
     (getA().getX(),getA().getY()+getAltura()));
     
     puntos.add(A);
     puntos.add(B);
     puntos.add(C);
     puntos.add(D);
     
     return(puntos);
 }
    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the A
     */
    public Punto getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(Punto A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public Punto getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(Punto B) {
        this.B = B;
    }

    /**
     * @return the C
     */
    public Punto getC() {
        return C;
    }

    /**
     * @param C the C to set
     */
    public void setC(Punto C) {
        this.C = C;
    }

    /**
     * @return the D
     */
    public Punto getD() {
        return D;
    }

    /**
     * @param D the D to set
     */
    public void setD(Punto D) {
        this.D = D;
    }
}
    
    
