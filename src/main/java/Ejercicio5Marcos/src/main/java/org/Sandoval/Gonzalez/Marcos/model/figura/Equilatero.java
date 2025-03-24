package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.SolicitaDatos;

public class Equilatero extends Triangulo implements SolicitaDatos {
    private int base;
    private int altura;
    private int lado;

    public Equilatero(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public Equilatero() {

    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return 3 * lado;
    }

    @Override
    public void leerDatos() {
        System.out.println("Dame la base:");
        this.base = ReadUtil.getInstance().leerInt();
        System.out.println("Dame la altura:");
        this.altura = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el lado:");
        this.lado = ReadUtil.getInstance().leerInt();
    }
}