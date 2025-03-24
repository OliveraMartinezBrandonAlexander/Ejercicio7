package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.SolicitaDatos;

public class Decagono extends Figura implements SolicitaDatos {
    private int lado;
    private int apotema;

    public Decagono(int lado, int apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public Decagono() {

    }

    @Override
    public double area() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double perimetro() {
        return 10 * lado;
    }

    @Override
    public void leerDatos() {
        System.out.println("Dame el lado:");
        this.lado = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el apotema:");
        this.apotema = ReadUtil.getInstance().leerInt();
    }
}