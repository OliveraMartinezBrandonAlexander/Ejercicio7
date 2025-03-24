package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.SolicitaDatos;

public class Octagono extends Figura implements SolicitaDatos {

    /*
     * Constructor
     * Getter
     * Setter
     * ToString
     * Methods
     * */



    private double apotema;
    private double lado;
    public Octagono() {
    }
    public Octagono(double lado, double apotema) {
        this.apotema = apotema;
        this.lado = lado;
    }


    @Override
    public double area() {
        return lado*8*apotema/2;
    }


    @Override
    public double perimetro() {
        return lado*8;
    }


    @Override
    public void leerDatos() {
        System.out.println("Dame el lado:");
        this.lado = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el apotema:");
        this.apotema = ReadUtil.getInstance().leerInt();
    }
}