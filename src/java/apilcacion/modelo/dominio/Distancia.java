/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apilcacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author merco_000
 */
public class Distancia implements Serializable {
    private double d;
    
    public Distancia() {
    }

    public Distancia(double d) {
        this.d = d;
    }
    public double calcularDistancia(Punto a,Punto b){
    d=Math.sqrt(Math.pow(b.getX()-a.getX(),2) + Math.pow(b.getY()-a.getY(),2));
    return d;
    }
            
    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }
    
}
