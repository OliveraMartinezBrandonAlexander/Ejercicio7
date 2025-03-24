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

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    private JLabel jLabel,jlabelRes, jLabelLado,jLabelRadio,jLabelBase,jLabelDiagonalMayor,jLabelDiagonalMenor,jLabelAltura,jLabelBaseE,jLabelAlturaE,jLabelBaseMayor,jLabelBaseMenor,jLabelLado1,jLabelLado2,jLabelLado3;
    private JTextField jTextField1, jTextField2, jTextField3,jTextField4,jTextField5;
    private JButton jButton;
    private JComboBox jComboBox;
    private Historiales historiales;

    private Ventana() {
        super("Ventana de figuras");
        init();
    }

    private void init() {
        jlabelRes = new JLabel("Resultados:");
        jlabelRes.setBounds(10, 260, 400, 20); // Ajusta la posición según lo necesites

        jLabel = new JLabel("Bienvenido, seleccione su figura e ingrese los valores");
        jLabel.setBounds(10, 10, 400, 20);
        jComboBox = new JComboBox<>(new String[]{"Circulo", "Cuadrado", "Equilatero", "Rectangulo", "Rombo", "Trapecio", "Isosceles", "Escaleno"});
        jComboBox.setBounds(10, 40, 200, 20);

        //boton calcular y actualizar
        jButton = new JButton("Calcular/actualizar");
        jButton.setBounds(10, 230, 150, 20);
        //cuadros de texto
        jTextField1 = new JTextField();
        jTextField1.setBounds(10, 80, 100, 20);
        jTextField2 = new JTextField();
        jTextField2.setBounds(10, 110, 100, 20);
        jTextField3 = new JTextField();
        jTextField3.setBounds(10, 140, 100, 20);
        jTextField4 = new JTextField();
        jTextField4.setBounds(10, 170, 100, 20);
        jTextField5 = new JTextField();
        jTextField5.setBounds(10,200,100,20);

        //textos atributos
        jLabelLado = new JLabel("lado");
        jLabelLado.setBounds(110, 80, 50, 20);
        jLabelRadio = new JLabel("radio");
        jLabelRadio.setBounds(110, 80, 50, 20);
        jLabelBase = new JLabel("base");
        jLabelBase.setBounds(110, 80, 50, 20);
        jLabelAltura = new JLabel("altura");
        jLabelAltura.setBounds(110, 110, 100, 20);
        jLabelDiagonalMayor = new JLabel("diagonal mayor");
        jLabelDiagonalMayor.setBounds(110, 110, 150, 20);
        jLabelDiagonalMenor = new JLabel("diagonal menor");
        jLabelDiagonalMenor.setBounds(110, 140, 150, 20);
        jLabelBaseE = new JLabel("base");
        jLabelBaseE.setBounds(110, 110, 50, 20);
        jLabelAlturaE = new JLabel("altura");
        jLabelAlturaE.setBounds(110, 140, 100, 20);
        jLabelBaseMayor = new JLabel("base mayor");
        jLabelBaseMayor.setBounds(110, 140, 150, 20);
        jLabelBaseMenor = new JLabel("base menor");
        jLabelBaseMenor.setBounds(110, 170, 150, 20);
        jLabelLado1 = new JLabel("lado 1");
        jLabelLado1.setBounds(110, 140, 150, 20);
        jLabelLado2 = new JLabel("lado 2");
        jLabelLado2.setBounds(110, 170, 150, 20);
        jLabelLado3 = new JLabel("lado 3");
        jLabelLado3.setBounds(110, 200, 150, 20);

        jButton.addActionListener(p -> {
            Figura figura = null;
            String figuraSeleccionada = (String) jComboBox.getSelectedItem();
            String resultado = "";

            switch (figuraSeleccionada) {
                case "Cuadrado":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(true);
                    jLabelRadio.setVisible(false);
                    jLabelBase.setVisible(false);
                    jLabelAltura.setVisible(false);
                    jLabelDiagonalMayor.setVisible(false);
                    jLabelDiagonalMenor.setVisible(false);
                    jLabelBaseE.setVisible(false);
                    jLabelAlturaE.setVisible(false);
                    jLabelBaseMayor.setVisible(false);
                    jLabelBaseMenor.setVisible(false);
                    jLabelLado1.setVisible(false);
                    jLabelLado2.setVisible(false);
                    jLabelLado3.setVisible(false);

                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado(ReadUtil.string2Integer(jTextField1.getText()));
                    break;
                case "Circulo":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(false);
                    jLabelRadio.setVisible(true);
                    jLabelBase.setVisible(false);
                    jLabelAltura.setVisible(false);
                    jLabelDiagonalMayor.setVisible(false);
                    jLabelDiagonalMenor.setVisible(false);
                    jLabelBaseE.setVisible(false);
                    jLabelAlturaE.setVisible(false);
                    jLabelBaseMayor.setVisible(false);
                    jLabelBaseMenor.setVisible(false);
                    jLabelLado1.setVisible(false);
                    jLabelLado2.setVisible(false);
                    jLabelLado3.setVisible(false);

                    figura = new Circulo();
                    ((Circulo) figura).setRadio(ReadUtil.string2Integer(jTextField1.getText()));
                    break;

                    //base altura e
                case "Equilatero":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(true);
                    jLabelRadio.setVisible(false);
                    jLabelBase.setVisible(false);
                    jLabelAltura.setVisible(false);
                    jLabelDiagonalMayor.setVisible(false);
                    jLabelDiagonalMenor.setVisible(false);
                    jLabelBaseE.setVisible(true);
                    jLabelAlturaE.setVisible(true);
                    jLabelBaseMayor.setVisible(false);
                    jLabelBaseMenor.setVisible(false);
                    jLabelLado1.setVisible(false);
                    jLabelLado2.setVisible(false);
                    jLabelLado3.setVisible(false);

                    figura = new Equilatero();
                    ((Equilatero) figura).setLado(ReadUtil.string2Integer(jTextField1.getText()));
                    ((Equilatero) figura).setBase(ReadUtil.string2Integer(jTextField2.getText()));
                    ((Equilatero) figura).setAltura(ReadUtil.string2Integer(jTextField3.getText()));
                    break;
                case "Rectangulo":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(false);
                    jLabelRadio.setVisible(false);
                    jLabelBase.setVisible(true);
                    jLabelAltura.setVisible(true);
                    jLabelDiagonalMayor.setVisible(false);
                    jLabelDiagonalMenor.setVisible(false);
                    jLabelBaseE.setVisible(false);
                    jLabelAlturaE.setVisible(false);
                    jLabelBaseMayor.setVisible(false);
                    jLabelBaseMenor.setVisible(false);
                    jLabelLado1.setVisible(false);
                    jLabelLado2.setVisible(false);
                    jLabelLado3.setVisible(false);

                    figura = new Rectangulo();
                    ((Rectangulo) figura).setBase(ReadUtil.string2Integer(jTextField1.getText()));
                    ((Rectangulo) figura).setAltura(ReadUtil.string2Integer(jTextField2.getText()));
                    break;
                case "Rombo":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(true);
                    jLabelRadio.setVisible(false);
                    jLabelBase.setVisible(false);
                    jLabelAltura.setVisible(false);
                    jLabelDiagonalMayor.setVisible(true);
                    jLabelDiagonalMenor.setVisible(true);
                    jLabelBaseE.setVisible(false);
                    jLabelAlturaE.setVisible(false);
                    jLabelBaseMayor.setVisible(false);
                    jLabelBaseMenor.setVisible(false);
                    jLabelLado1.setVisible(false);
                    jLabelLado2.setVisible(false);
                    jLabelLado3.setVisible(false);

                    figura = new Rombo();
                    ((Rombo) figura).setLado(ReadUtil.string2Integer(jTextField1.getText()));
                    ((Rombo) figura).setDiagonalMayor(ReadUtil.string2Integer(jTextField2.getText()));
                    ((Rombo) figura).setDiagonalMenor(ReadUtil.string2Integer(jTextField3.getText()));
                    break;
                case "Trapecio":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(false);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(true);
                    jLabelRadio.setVisible(false);
                    jLabelBase.setVisible(false);
                    jLabelAltura.setVisible(true);
                    jLabelDiagonalMayor.setVisible(false);
                    jLabelDiagonalMenor.setVisible(false);
                    jLabelBaseE.setVisible(false);
                    jLabelAlturaE.setVisible(false);
                    jLabelBaseMayor.setVisible(true);
                    jLabelBaseMenor.setVisible(true);
                    jLabelLado1.setVisible(false);
                    jLabelLado2.setVisible(false);
                    jLabelLado3.setVisible(false);

                    figura = new Trapecio();
                    ((Trapecio) figura).setLado(ReadUtil.string2Integer(jTextField1.getText()));
                    ((Trapecio) figura).setAltura(ReadUtil.string2Integer(jTextField2.getText()));
                    ((Trapecio) figura).setBaseMayor(ReadUtil.string2Integer(jTextField3.getText()));
                    ((Trapecio) figura).setBaseMenor(ReadUtil.string2Integer(jTextField4.getText()));
                    break;
                    //lado e
                case "Isosceles":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(false);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(false);
                    jLabelRadio.setVisible(false);
                    jLabelBase.setVisible(true);
                    jLabelAltura.setVisible(true);
                    jLabelDiagonalMayor.setVisible(false);
                    jLabelDiagonalMenor.setVisible(false);
                    jLabelBaseE.setVisible(false);
                    jLabelAlturaE.setVisible(false);
                    jLabelBaseMayor.setVisible(false);
                    jLabelBaseMenor.setVisible(false);
                    jLabelLado1.setVisible(true);
                    jLabelLado2.setVisible(true);
                    jLabelLado3.setVisible(false);

                    figura = new Isosceles();
                    ((Isosceles) figura).setBase(ReadUtil.string2Integer(jTextField1.getText()));
                    ((Isosceles) figura).setAltura(ReadUtil.string2Integer(jTextField2.getText()));
                    ((Isosceles) figura).setLado(ReadUtil.string2Integer(jTextField3.getText()));
                    ((Isosceles) figura).setLado2(ReadUtil.string2Integer(jTextField4.getText()));
                    break;

                    //lados e
                case "Escaleno":
                    //cuadros mostrar/ocultar
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);

                    //atributos mostrar/ocultar
                    jLabelLado.setVisible(false);
                    jLabelRadio.setVisible(false);
                    jLabelBase.setVisible(true);
                    jLabelAltura.setVisible(true);
                    jLabelDiagonalMayor.setVisible(false);
                    jLabelDiagonalMenor.setVisible(false);
                    jLabelBaseE.setVisible(false);
                    jLabelAlturaE.setVisible(false);
                    jLabelBaseMayor.setVisible(false);
                    jLabelBaseMenor.setVisible(false);
                    jLabelLado1.setVisible(true);
                    jLabelLado2.setVisible(true);
                    jLabelLado3.setVisible(true);

                    figura = new Escaleno();
                    ((Escaleno) figura).setBase(ReadUtil.string2Integer(jTextField1.getText()));
                    ((Escaleno) figura).setAltura(ReadUtil.string2Integer(jTextField2.getText()));
                    ((Escaleno) figura).setLado(ReadUtil.string2Integer(jTextField3.getText()));
                    ((Escaleno) figura).setLado2(ReadUtil.string2Integer(jTextField4.getText()));
                    ((Escaleno) figura).setLado3(ReadUtil.string2Integer(jTextField5.getText()));
                    break;
                default:
                    System.out.println("Figura no encontrada");
                    return;
            }

            double area = figura.area();
            double perimetro = figura.perimetro();

            // Mostrar los resultados en el JLabel
            resultado = "area: " + area + " /// "  + "perimetro: " + perimetro ;
            jlabelRes.setText(resultado);
            historiales.addFigura(figura);

        });

        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(jComboBox);
        getContentPane().add(jTextField1);
        getContentPane().add(jTextField2);
        getContentPane().add(jTextField3);
        getContentPane().add(jTextField4);
        getContentPane().add(jTextField5);
        getContentPane().add(jButton);
        getContentPane().add(jLabelLado);
        getContentPane().add(jLabelRadio);
        getContentPane().add(jLabelDiagonalMayor);
        getContentPane().add(jLabelDiagonalMenor);
        getContentPane().add(jLabelBase);
        getContentPane().add(jLabelAltura);
        getContentPane().add(jLabelAlturaE);
        getContentPane().add(jLabelBaseE);
        getContentPane().add(jLabelBaseMayor);
        getContentPane().add(jLabelBaseMenor);
        getContentPane().add(jLabelLado1);
        getContentPane().add(jLabelLado2);
        getContentPane().add(jLabelLado3);

        getContentPane().add(jlabelRes);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setBounds(100, 100, 400, 300);
        setVisible(true);
    }

    @Override
    public void addHistoriales(Historiales historiales) {

        this.historiales= historiales;
    }
}
