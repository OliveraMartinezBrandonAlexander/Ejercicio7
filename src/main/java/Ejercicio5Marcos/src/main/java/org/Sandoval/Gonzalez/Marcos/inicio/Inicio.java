package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.inicio;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.Consola;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.Ejecutable;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.Menu;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.Ventana;

public class Inicio
{

    /**
     * Default constructor
     */
    public Inicio()
    {
        // CONSTRUCTOR POR DEFECTO
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {

        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while( flag )
        {
            ejecutable = null;
            Menu.principal2( );
            // SE OBTIENE LA OPCION DEL USUARIO DESDE LA UTILIDAD DE LECTURA
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );    // PATRON SINGLETON: getInstance() ASEGURA UNA INSTANCIA UNICA
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );    // TAMBIEN SE IMPLEMENTA EL PATRON SINGLETON
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.run( ); //AQUI SE APLICA POLIMORFISMO: EJECUTA EL METODO 'run()' DE LA IMPLEMENTACION CONCRETA
            }
        }



    }

}