package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.util.ReadUtil;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Menu;

/**
 *
 */
public class Cuadrado extends Figura
{

    private double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    @Override
    public double area()
    {
        return lado*lado;
    }

    @Override
    public double perimetro()
    {
        return lado*4;
    }

    @Override
    public void leerDatos()
    {
        Menu.menuCuadrado( );
        lado = ReadUtil.getInstance().leerInt( );
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}