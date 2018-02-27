/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *Clase que contiene metodo para calcular x numeros de fibonacci que requiera el usuario
 * @author Juan José Rangel
 * @since Version 1.3
 */
public class Serie {

    /**
     *Metodo que contiene las sentencias necesarias para calcular x numeros de Fibonacci.
     *@author Juan Josè Rangel
     *@since Version 1.3
     */
    public void Serie() {
        System.out.println("Serie Fibonacci");
        int num1 = 0, num2 = 1, temp, lim;
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros de Fibonacci a calcular: ");
        lim = var.nextInt();
        System.out.println("La serie Fibonacci es: ");
        System.out.print(num1 + ", " + num2 + ", ");
        for (int i = 3; i <= lim; i++) {
            temp = num1;
            num1 = num2;
            num2 = temp + num1;
            System.out.print(num2);
            if (i < lim) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
}
