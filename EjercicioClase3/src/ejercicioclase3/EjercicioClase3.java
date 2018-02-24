/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase3;
import java.util.Scanner;
/**
 *
 * @author JuanJ y CarlosO
 */

public class EjercicioClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad, a=0;
        while(a!=2){
        System.out.println("Digite su edad: ");
        edad= sc.nextInt();
        
        if(edad>=0&&edad<=6){
           System.out.println("Edad: "+edad+" años"); 
           System.out.println("Categoria: Pre-Infantil"); 
        }
        if(edad>=7&&edad<=17){
           System.out.println("Edad: "+edad+" años"); 
           System.out.println("Categoria: Infantil"); 
        }
        if(edad>=18&&edad<=25){
           System.out.println("Edad: "+edad+" años"); 
           System.out.println("Categoria: Juvenil"); 
        }
        if(edad>=26&&edad<=45){
           System.out.println("Edad; "+edad+" años"); 
           System.out.println("Categoria: Mayores"); 
        }
        if(edad>=60){
           System.out.println("Edad; "+edad+" años"); 
           System.out.println("Categoria: Veteranos"); 
        }
        System.out.println("Desea ver mas categorias?: Si=1, No=2"); 
        a = sc.nextInt();
    }
    }
    
}
