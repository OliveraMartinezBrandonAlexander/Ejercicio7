package Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.vista;

import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Circulo;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Cuadrado;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Equilatero;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Figura;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Rectangulo;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Rombo;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.Trapecio;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.figura2.Escaleno;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.model.figura.figura2.Isosceles;
import Ejercicio5Alex.ejercicio5.src.main.java.org.olivera.martinez.brandon.util.ReadUtil;
import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.SolicitaDatos;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Historiales historiales;
    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if( consola == null )
        {
            consola = new Consola( );
        }
        return consola;
    }

    @Override
    public void run()
    {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while( flag )
        {
            figura = null;
            Menu.principal( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    figura = new Cuadrado( );
                    break;
                case 2:
                    figura = new Equilatero( );
                    break;
                case 3:
                    figura = new Isosceles( );
                    break;
                case 4:
                    figura = new Escaleno( );
                    break;
                case 5:
                    figura = new Circulo();
                    break;
                case 6:
                    figura = new Rectangulo();
                    break;
                case 7:
                    figura = new Rombo();
                    break;
                case 8:
                    figura = new Trapecio();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( figura != null )
            {
                ((SolicitaDatos)figura).leerDatos( );
                org.gerdoc.vista.Menu.print( figura );
                historiales.addFigura( figura );
            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales=historiales;
    }
}
