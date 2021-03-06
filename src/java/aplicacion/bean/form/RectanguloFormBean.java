/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import apilcacion.modelo.dominio.Punto;
import apilcacion.modelo.dominio.Rectangulo;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author merco_000
 */
@ManagedBean
@SessionScoped
public class RectanguloFormBean {
    private double x1;
    private double y1;
    private double base;
    private double altura;
    private ArrayList<Punto> puntoEncontrados;
    private Rectangulo unRectangulo = new Rectangulo();
   // private Rectangulo rectangulo = new Rectangulo();
    /**
     * Creates a new instance of RectanguloFormBean
     */
    public RectanguloFormBean() {
    }
   public void calcularOtrosPuntos(){

       unRectangulo.crearPuntoS(x1, y1, altura, base);

   }
    public double obtenerPer()
    {
        return (base*2+altura*2);
    }
    public double obtenerSup()
    {
        return (base*altura);
    }
    public double obtenerPuntoBX()
    {
        return unRectangulo.obtenerPuntoBX();
    }
    public double obtenerPuntoBY()
    {
        return unRectangulo.obtenerPuntoBY();
    }
    public double obtenerPuntoCX()
    {
        return unRectangulo.obtenerPuntoCX();
    }
    public double obtenerPuntoCY()
    {
        return unRectangulo.obtenerPuntoCY();
    }
    public double obtenerPuntoDX()
    {
        return unRectangulo.obtenerPuntoDX();
    }
    public double obtenerPuntoDY()
    {
        return unRectangulo.obtenerPuntoDY();
    }
    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public double getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(double y1) {
        this.y1 = y1;
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
     * @return the puntoEncontrados
     */
    public ArrayList<Punto> getPuntoEncontrados() {
        return puntoEncontrados;
    }

    /**
     * @param puntoEncontrados the puntoEncontrados to set
     */
    public void setPuntoEncontrados(ArrayList<Punto> puntoEncontrados) {
        this.puntoEncontrados = puntoEncontrados;
    }

    /**
     * @return the unRectangulo
     */
}
