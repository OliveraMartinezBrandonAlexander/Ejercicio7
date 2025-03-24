package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.SolicitaDatos;

public class Circulo extends Figura implements SolicitaDatos {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {

    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void leerDatos() {
        System.out.println("Dame el radio:");
        this.radio = ReadUtil.getInstance().leerInt();
    }
}
