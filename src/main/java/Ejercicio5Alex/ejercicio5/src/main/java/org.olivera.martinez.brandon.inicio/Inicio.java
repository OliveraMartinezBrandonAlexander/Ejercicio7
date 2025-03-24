package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.inicio;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Cuadrado;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Equilatero;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Figura;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.util.ReadUtil;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Consola;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Ejecutable;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Menu;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista.Ventana;

/**
 *
 */
public class Inicio
{

    /**
     * Default constructor
     */
    public Inicio()
    {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        System.out.println("hola gerdoc 2");
        while( flag )
        {
            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.run( );
            }
        }



    }

}