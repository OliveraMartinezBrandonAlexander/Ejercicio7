package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.util.ReadUtil;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Menu;

public class Trapecio extends Figura
{

    private double lado,altura, BaseMayor, BaseMenor;

    public Trapecio(){

    }

    public Trapecio(double lado, double altura, double baseMayor, double baseMenor) {
        this.lado = lado;
        this.altura = altura;
        BaseMayor = baseMayor;
        BaseMenor = baseMenor;

    }


    @Override
    public double area() {
        return ((BaseMayor + BaseMenor) * altura) / 2;
    }

    @Override
    public double perimetro() {
        return BaseMayor + BaseMenor + (lado *2 );
    }

    public double getBaseMayor() {
        return BaseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        BaseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return BaseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        BaseMenor = baseMenor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void leerDatos() {
        Menu.menuCuadrado();
        lado = ReadUtil.getInstance().leerInt();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt();
        Menu.menuBaseMayor();
        BaseMayor = ReadUtil.getInstance().leerInt();
        Menu.menuBaseMenor();
        BaseMenor = ReadUtil.getInstance().leerInt();
    }
}
