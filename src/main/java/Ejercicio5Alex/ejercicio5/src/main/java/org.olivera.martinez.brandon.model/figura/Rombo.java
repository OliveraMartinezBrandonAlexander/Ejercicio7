package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.util.ReadUtil;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Menu;

public class Rombo extends Figura
{
    private double lado, DiagonalMayor, DiagonalMenor;

    public Rombo () {

    }

    public Rombo( double lado, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        DiagonalMayor = diagonalMayor;
        DiagonalMenor = diagonalMenor;

    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public double area() {
        return (DiagonalMenor * DiagonalMayor) / 2;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagonalMenor() {
        return DiagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        DiagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return DiagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        DiagonalMayor = diagonalMayor;
    }

    @Override
    public void leerDatos() {
        Menu.menuCuadrado();
        lado = ReadUtil.getInstance().leerInt();
        Menu.menuDiagonalMayor();
        DiagonalMayor = ReadUtil.getInstance().leerInt();
        Menu.menuDiagonalMenor();
        DiagonalMenor = ReadUtil.getInstance().leerInt();

    }
}
