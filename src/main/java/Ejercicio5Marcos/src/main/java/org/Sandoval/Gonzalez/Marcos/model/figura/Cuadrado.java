package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.SolicitaDatos;

public class Cuadrado extends Figura implements SolicitaDatos {
    private int lado;

    public Cuadrado() {}

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void leerDatos() {
        System.out.println("Dame un lado:");
        this.lado = ReadUtil.getInstance().leerInt();
    }
}