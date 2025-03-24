package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println( "welcome");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Cuadrado");
        System.out.println( "2.- Equilatero");
        System.out.println( "3.- Isoceles");
        System.out.println( "4.- Escaleno");
        System.out.println( "5.- Circulo");
        System.out.println( "6.- Rectangulo");
        System.out.println( "7.- Rombo");
        System.out.println( "8.- Trapecio");
        System.out.println( "9.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println( "Opción invalida");
    }

    public static void print(Figura figura)
    {
        System.out.println( "El perimetro es:" + figura.perimetro() );
        System.out.println( "El area es:" + figura.area() );
    }

    public static void principal2( )
    {
        System.out.println( "welcome");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Consola");
        System.out.println( "2.- Ventana");
        System.out.println( "3.- Salir");
    }

    public static void menuCuadrado( )
    {
        System.out.println( "Ingresa un lado");
    }

    public static void menuBase( )
    {
        System.out.println( "Ingresa una base");
    }

    public static void menuAltura( )
    {
        System.out.println( "Ingresa una altura");
    }

    public static void menuLado1( )
    {
        System.out.println( "Ingresa un lado 1");
    }

    public static void menuLado2( )
    {
        System.out.println( "Ingresa un lado 2");
    }

    public static void menuLado3( )
    {
        System.out.println( "Ingresa un lado 3");
    }

    public static void menuBaseMayor( )
    {
        System.out.println( "Ingresa la base mayor");
    }

    public static void menuBaseMenor( )
    {
        System.out.println( "Ingresa la base menor");
    }

    public static void menuRadio( )
    {
        System.out.println( "Ingresa el radio");
    }

    public static void menuDiagonalMayor( )
    {
        System.out.println( "Ingresa la diagonal mayor");
    }

    public static void menuDiagonalMenor( )
    {
        System.out.println( "Ingresa la diagonal menor");
    }
}
