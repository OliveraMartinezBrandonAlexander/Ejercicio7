package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.util.ReadUtil;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Menu;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Equilatero extends Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Triangulo
{

    /**
     * Default constructor
     */
    public Equilatero()
    {
    }

    public Equilatero(double base, double altura, double lado1)
    {
        super(base, altura);
        this.lado1 = lado1;
    }

    /**
     * 
     */
    protected double lado1;

    public Equilatero(double lado1)
    {
        this.lado1 = lado1;
    }



    /**
     * @return
     */
    public double getLado1() {

        return lado1;
    }

    /**
     * @param lado1
     */
    public void setLado(double lado1)
    {
        this.lado1 = lado1;
    }

    /**
     * @return
     */
    public  double perimetro()
    {
        return lado1*3;
    }

    @Override
    public void leerDatos()
    {
        super.leerDatos();
        Menu.menuLado1( );
        lado1 = ReadUtil.getInstance().leerInt();
    }
}

