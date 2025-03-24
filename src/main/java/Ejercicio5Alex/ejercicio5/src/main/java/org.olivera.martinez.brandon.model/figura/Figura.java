package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.SolicitaDatos;

import java.io.*;
import java.util.*;

/**
 * 
 */
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
    public abstract double perimetro();
}