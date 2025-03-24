package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.vista;

import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.figura2.Escaleno;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.figura2.Isosceles;
import org.gerdoc.historial.Historiales;
import Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.model.figura.*;
import javax.swing.*;
import static Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util.ReadUtil.string2Integer;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    private  Historiales historiales ;

    private JLabel label1, label2, label3, labelBase, labelAltura, labelRadio, labelApotema;
    private JTextField textField1, textField2, textField3, textBase, textAltura, textRadio, textApotema;
    private JButton calcularButton;
    private JTextArea resultArea;
    private JComboBox<String> figuraComboBox;


    private Ventana() {
        super("Ventana de Figuras");
        init();
    }

    private void init() {
        setLayout(null);

        figuraComboBox = new JComboBox<>(new String[]{"Cuadrado", "Circulo", "Decagono", "Octagono", "Equilatero", "Isosceles", "Escaleno"});
        figuraComboBox.setBounds(10, 10, 150, 20);
        figuraComboBox.addActionListener(e -> actualizarCampos());
        add(figuraComboBox);

        label1 = new JLabel("Lado:");
        label1.setBounds(10, 40, 100, 20);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(120, 40, 100, 20);
        add(textField1);

        label2 = new JLabel("Segundo lado:");
        label2.setBounds(10, 70, 100, 20);
        add(label2);

        textField2 = new JTextField();
        textField2.setBounds(120, 70, 100, 20);
        add(textField2);

        label3 = new JLabel("Tercer lado:");
        label3.setBounds(10, 100, 100, 20);
        add(label3);

        textField3 = new JTextField();
        textField3.setBounds(120, 100, 100, 20);
        add(textField3);

        labelBase = new JLabel("Base:");
        labelBase.setBounds(10, 130, 100, 20);
        add(labelBase);

        textBase = new JTextField();
        textBase.setBounds(120, 130, 100, 20);
        add(textBase);

        labelAltura = new JLabel("Altura :");
        labelAltura.setBounds(10, 160, 100, 20);
        add(labelAltura);

        textAltura = new JTextField();
        textAltura.setBounds(120, 160, 100, 20);
        add(textAltura);

        labelRadio = new JLabel("Radio del circulo:");
        labelRadio.setBounds(10, 190, 100, 20);
        add(labelRadio);

        textRadio = new JTextField();
        textRadio.setBounds(120, 190, 100, 20);
        add(textRadio);

        labelApotema = new JLabel("Apotema:");
        labelApotema.setBounds(10, 220, 100, 20);
        add(labelApotema);

        textApotema = new JTextField();
        textApotema.setBounds(120, 220, 100, 20);
        add(textApotema);

        calcularButton = new JButton("Calcular datos");
        calcularButton.setBounds(10, 250, 210, 20);
        calcularButton.addActionListener(e -> calcular());
        add(calcularButton);

        resultArea = new JTextArea();
        resultArea.setBounds(230, 10, 250, 250);
        resultArea.setEditable(false);

        add(resultArea);

        actualizarCampos();
}

    private void actualizarCampos() { String figuraSeleccionada = (String) figuraComboBox.getSelectedItem();
        boolean esTriangulo = figuraSeleccionada.contains("Equilatero") || figuraSeleccionada.contains("Isosceles") || figuraSeleccionada.contains("Escaleno");
        boolean esOctagono = figuraSeleccionada.contains("Octagono");
        boolean esCirculo = figuraSeleccionada.contains("Circulo");
        boolean esDecagono = figuraSeleccionada.contains("Decagono");
        label1.setVisible(!esCirculo);
        textField1.setVisible(!esCirculo);
        label2.setVisible(figuraSeleccionada.equals("Isosceles") || figuraSeleccionada.equals("Escaleno"));
        textField2.setVisible(figuraSeleccionada.equals("Isosceles") || figuraSeleccionada.equals("Escaleno"));

        label3.setVisible("Escaleno".equals(figuraSeleccionada));
        textField3.setVisible("Escaleno".equals(figuraSeleccionada));
        labelBase.setVisible(esTriangulo );
        textBase.setVisible(esTriangulo );
        labelAltura.setVisible(esTriangulo );
        textAltura.setVisible(esTriangulo );
        labelRadio.setVisible(esCirculo);
        textRadio.setVisible(esCirculo);
        labelApotema.setVisible(esOctagono || esDecagono);
        textApotema.setVisible(esOctagono || esDecagono);
    }



    private void calcular() {
        try {
            String figuraSeleccionada = (String) figuraComboBox.getSelectedItem();
            Figura figura;

            if ("Cuadrado".equals(figuraSeleccionada)) {
                int lado = string2Integer(textField1.getText());
                figura = new Cuadrado();
                ((Cuadrado) figura).setLado(lado);
            }




            else if ("Decagono".equals(figuraSeleccionada)) {
                int lado = string2Integer(textField1.getText());
                int apotema = string2Integer(textApotema.getText());
                figura = new Decagono(lado, apotema);
            }


            else if ("Circulo".equals(figuraSeleccionada)) {
                int radio = string2Integer(textRadio.getText());
                figura = new Circulo(radio);
            }



            else if ("Octagono".equals(figuraSeleccionada)) {
                int lado = string2Integer(textField1.getText());
                int apotema = string2Integer(textApotema.getText());
                figura = new Octagono(lado, apotema);
            }



            else if ("Equilatero".equals(figuraSeleccionada)) {
                int base = string2Integer(textBase.getText());
                int altura = string2Integer(textAltura.getText());
                int lado = string2Integer(textField1.getText());
                figura = new Equilatero(base, altura, lado);
            }



            else if ("Isosceles".equals(figuraSeleccionada)) {
                int base = string2Integer(textBase.getText());
                int altura = string2Integer(textAltura.getText());
                int lado1 = string2Integer(textField1.getText());
                int lado2 = string2Integer(textField2.getText());
                figura = new Isosceles(base, altura, lado1, lado2);
            }



            else {
                int base = string2Integer(textBase.getText());
                int altura = string2Integer(textAltura.getText());
                int lado1 = string2Integer(textField1.getText());
                int lado2 = string2Integer(textField2.getText());
                int lado3 = string2Integer(textField3.getText());
                figura = new Escaleno(base, altura, lado1, lado2, lado3);
            }

            double area = figura.area();
            double perimetro = figura.perimetro();

            resultArea.setText("Resultados:\n");
            resultArea.append("Figura: " + figuraSeleccionada + "\n");
            resultArea.append("Área: " + area + "\n");
            resultArea.append("Perímetro: " + perimetro + "\n");
            historiales.addFigura(figura);
        } catch (NumberFormatException ex) {
            resultArea.setText("Por favor, ingrese números positivos.");
        }
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setSize(300, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}