package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.figura2;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.Figura;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.SolicitaDatos;

public class Isosceles extends Figura implements SolicitaDatos {
    private double base;
    private double altura;
    protected double lado1;
    protected double lado2;

    public Isosceles(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Isosceles() {

    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public void leerDatos() {
        System.out.println("Dame la base:");
        this.base = ReadUtil.getInstance().leerInt();
        System.out.println("Dame la altura:");
        this.altura = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el lado 1:");
        this.lado1 = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el lado 2:");
        this.lado2 = ReadUtil.getInstance().leerInt();
    }
}