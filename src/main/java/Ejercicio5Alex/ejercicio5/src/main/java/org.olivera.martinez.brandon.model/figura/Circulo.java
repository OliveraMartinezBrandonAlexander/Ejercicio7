package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.util.ReadUtil;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Menu;

public class Circulo extends Figura
{
    private double radio;

    public Circulo (){

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return 2 * radio * Math.PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void leerDatos() {
        Menu.menuRadio();
        radio = ReadUtil.getInstance().leerInt();
    }
}
