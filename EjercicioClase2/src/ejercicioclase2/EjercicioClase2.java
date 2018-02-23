/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase2;
import java.util.Scanner;
/**
 *
 * @author JuanJ y CarlosO
 */
public class EjercicioClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int mes, a=0;
        while(a!=2){
        System.out.println("Digite numero del mes: ");
        mes= sc.nextInt();
        
        if(mes==1){
           System.out.println("Enero-Invierno");  
        }
        if(mes==2){
           System.out.println("Febrero-Invierno");  
        }
       if(mes==3){
           System.out.println("Marzo-Invierno");  
        }
        if(mes==4){
           System.out.println("Abril-Verano");  
        }
        if(mes==5){
           System.out.println("Marzo-Verano");  
        }
        if(mes==6){
           System.out.println("Junio-Verano");  
        }
        if(mes==7){
           System.out.println("Julio-Otoño");  
        }
        if(mes==8){
           System.out.println("Agosto-Otoño");  
        }
        if(mes==9){
           System.out.println("Septiembre-Otoño");  
        }
        if(mes==10){
           System.out.println("Octubre-Primavera");  
        }
        if(mes==11){
           System.out.println("Noviembre-Primavera");  
        }
        if(mes==12){
           System.out.println("Diciembre-Primavera");  
        }
        if(mes<=0||mes>=13){
            System.out.println("Mes no existe");
        }
        System.out.println("Desea ingresar otro mes?: Si=1, No=2"); 
        a = sc.nextInt();
    }
    }
    
}
