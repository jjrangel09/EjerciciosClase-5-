/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import EstacionesAño.EstacionesAño;
import PromediosEst.PromediosEst;
import CategoriasEdad.CategoriasEdad;
import ConvSegundos.Convertidor;
import Fibonacci.Serie;
import java.util.Scanner;

/**
 *
 * @author CarlosO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        PromediosEst objeto1 = new PromediosEst();
        EstacionesAño objeto2 = new EstacionesAño();
        CategoriasEdad objeto3 = new CategoriasEdad();
        Convertidor objeto4 = new Convertidor();
        Serie objeto5 = new Serie();
        int s;
        do {
            System.out.println("             Menu        ");
            System.out.println("1.Promedio de notas de estudiante");
            System.out.println("2.Epoca del año");
            System.out.println("3.Categoria respecto a la edad");
            System.out.println("4.Conversor de tiempo");
            System.out.println("5.Serie Fibonacci");
            System.out.println("6.SALIR");
            System.out.println("Ingrese una opcion: ");
            s = sc.nextInt();
            switch (s) {
                case 1:
                    objeto1.promedios();
                    break;
                case 2:
                    objeto2.estaciones();
                    break;
                case 3:
                    objeto3.categorias();
                    break;
                case 4:
                    objeto4.Convertidor();
                    break;
                case 5:
                    objeto5.Serie();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println(s + ": No es una Opcion valida.");
                    System.out.print("Desea seleccionar otra opcion? Si=1 No=2: ");
                    s = sc.nextInt();
            }

        } while (s != 2);

    }
}
