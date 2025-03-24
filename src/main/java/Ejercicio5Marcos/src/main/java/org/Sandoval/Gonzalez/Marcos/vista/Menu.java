package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println( "welcome");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Cuadrado");
        System.out.println( "2.- Circulo");
        System.out.println( "3.- Decágono");
        System.out.println( "4.- Octagono");
        System.out.println( "5.- Equilatero");
        System.out.println( "6.- Isoceles");
        System.out.println( "7.- Escaleno");
        System.out.println( "8.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println( "Opción invalida");
    }

    public static void print(Figura figura)
    {
        System.out.println( "El perímetro es: " + figura.perimetro() );
        System.out.println( "El área es: " + figura.area() );
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
        System.out.println( "Dame un lado");
    }

    public static void menuRectangulo( )
    {
        System.out.println( "Dame el lado");
        System.out.println( "Dame la base");
    }

    public static void menuDecagono( )
    {
        System.out.println( "Dame el lado");
        System.out.println( "Dame el apotema");
    }

    public static void menuCirculo( )
    {
        System.out.println( "Dame el radio");
    }

    public static void menuPentagono( )
    {
        System.out.println( "Dame el lado");
        System.out.println( "Dame el apotema");
    }

    public static void menuOctagono( )
    {
        System.out.println( "Dame el lado");
        System.out.println( "Dame el apotema");
    }

    public static void menuBase( )
    {
        System.out.println( "Dame una base");
    }

    public static void menuAltura( )
    {
        System.out.println( "Dame una altura");
    }

    public static void menuLado1( )
    {
        System.out.println( "Dame un lado 1");
    }

    public static void menuLado2( )
    {
        System.out.println( "Dame un lado 2");
    }

    public static void menuLado3( )
    {
        System.out.println( "Dame un lado 3");
    }
}