/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromediosEst;
import java.util.Scanner;
/**
 *
 * @author JuanJ
 */
public class PromediosEst {

    

    /**
     * @param args the command line arguments
     */
    public void promedios () {
        // TODO code application logic here
        String nombre;

        String desea = "si";
        float cantN = 0;
        float nota;
        float suma = 0;
        float prom;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del estudiante: ");
	nombre = sc.nextLine();
        
        do{
            cantN++;
            Scanner notas = new Scanner(System.in);
            System.out.println("Introduzca nota: ");
            nota = sc.nextInt();
            suma = suma+nota;
            Scanner deseo = new Scanner(System.in);
            System.out.println("Desea agregar nota? (Si/No)");
	    desea = deseo.nextLine();
        }
        while("si".equals(desea));
        prom=suma/cantN;
        System.out.println("Nombre: "+nombre+", "+"Nota: "+prom);
    }

}
