/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promedios;

import java.util.Scanner;

/**
 *
 * @author JuanJ
 */
public class PromediosEst {
    String nombre;
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
}
