package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.SolicitaDatos;

public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */


    public Figura()
    {
    }

    /**
     * @return
     */

    public abstract double area( );

    /**
     * @return
     */
    ///**

    public abstract double perimetro();
}