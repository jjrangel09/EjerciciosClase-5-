/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promedios;
<<<<<<< HEAD

import java.util.Scanner;

=======
import java.util.Scanner;
>>>>>>> master
/**
 *
 * @author JuanJ
 */
public class PromediosEst {
<<<<<<< HEAD
    String nombre;
=======

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
>>>>>>> master
        String desea = "si";
        int cantN = 0;
        int nota;
        int suma = 0;
        float prom;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del Estudiante: ");
	nombre = sc.nextLine();
        
        do{
            cantN++;
            Scanner notas = new Scanner(System.in);
            System.out.println("Introduzca nota: ");
            nota = sc.nextInt();
            suma = suma+nota;
            Scanner deseo = new Scanner(System.in);
            System.out.println("Desea agregar nota? (si/no)");
	    desea = deseo.nextLine();
        }while("si".equals(desea));
        prom=suma/cantN;
        System.out.println("Nombre: "+nombre+", "+"Nota: "+prom);
    }
<<<<<<< HEAD
}
=======
    
>>>>>>> master
