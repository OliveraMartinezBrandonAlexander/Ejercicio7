package Ejercicio5Marcos.src.main.java.org.Sandoval.Gonzalez.Marcos.util;

import java.util.Scanner;

public class ReadUtil {
    private Scanner scanner;
    private static ReadUtil readUtil;

    private ReadUtil() {
        scanner = new Scanner(System.in);
    }

    public static ReadUtil getInstance() {
        if (readUtil == null) {
            readUtil = new ReadUtil();
        }
        return readUtil;
    }

    public String leer() {
        return scanner.next();
    }

    public Integer leerInt() {
        while (true) {
            try {
                Integer valor = Integer.valueOf(leer());
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("El número debe ser entero positivo. Intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("No es un entero. Intenta de nuevo.");
            }
        }
    }

    public static Integer string2Integer(String cadena) {
        try {
            return Integer.valueOf(cadena);
        } catch (NumberFormatException e) {
            System.out.println("No es un entero.");
            return null;
        }
    }
}
