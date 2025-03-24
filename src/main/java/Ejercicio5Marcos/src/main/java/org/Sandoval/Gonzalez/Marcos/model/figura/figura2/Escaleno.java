package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.figura2;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.Menu;

public class Escaleno extends Isosceles
{
    private double lado3;

    public Escaleno()
    {
    }

    public Escaleno(double base, double altura, double lado1, double lado2, double lado3)
    {
        //LLAMA AL CONSTRUCTOR DE LA CLASE PADRE(ISOSCELES) PARA INICIALIZAR LOS VALORES HEREDADOS
        super(base, altura, lado1, lado2);
        this.lado3 = lado3; //ASIGNA EL NUEVO VALOR ESPECIFICO DE ESCALENO
    }
    //CONSTRUCTOR SOBRECARGADO QUE INICIALIZA UN TRIANGULO ESCALENO CON SUS TRES LADOS
    public Escaleno(int lado1, int lado2, int lado3) {
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public double getLado3()
    {
        return lado3;
    }

    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }

    @Override
    public double perimetro()
    {
        return lado1+lado2+lado3;
    }

    @Override
    public void leerDatos()
    {
        super.leerDatos();
        Menu.menuLado3( );
        lado3 = ReadUtil.getInstance().leerInt();
    }

}