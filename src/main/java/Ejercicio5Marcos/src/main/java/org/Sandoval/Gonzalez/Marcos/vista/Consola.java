package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista;


import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.*;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.figura2.Escaleno;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.figura2.Isosceles;
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
            Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista.Menu.principal( );
            opcion = Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    figura = new Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.Cuadrado( );
                    break;
                case 2:
                    figura = new Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.Circulo( );
                    break;
                case 3:
                    figura = new Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.Decagono( );
                    break;

                case 4:
                    figura = new Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.Octagono( );
                    break;
                case 5:
                    figura = new Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.Equilatero( );
                    break;
                case 6:
                    figura = new Isosceles( );
                    break;
                case 7:
                    figura = new Escaleno( );
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            // Si se ha seleccionado una figura válida
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