package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.Menu;

public abstract class Triangulo extends Figura
{
    protected double base;
    protected double altura;

    /**
     * Default constructor
     */
    public Triangulo()
    {
    }
    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     */


    /**
     * @return
     */
    public double area()
    {
        return (base*altura)/2;
    }

    /**
     * @return
     */

    public abstract double perimetro();

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public void leerDatos()
    {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerInt( );
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt( );
    }
}