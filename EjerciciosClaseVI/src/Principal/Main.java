/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import EstacionesAño.EstacionesAño;
import PromediosEst.PromediosEst;
import CategoriasEdad.CategoriasEdad;
import java.util.Scanner;


/**
 *
 * @author JuanJ y CarlosO
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
        int a=0;
        while(a!=2){
        int s;
        System.out.println("             Menu        ");
        System.out.println("1.Promedio de notas de Estudiante");
        System.out.println("2.Epoca del año");
        System.out.println("3.Categoria respecro a la edad");
        System.out.println("4.Conversor de tiempo");
        System.out.println("Ingrese una opcion ");
        s = sc.nextInt();
        switch(s){ 
            case 1:  
                objeto1.promedios();
            break;
            case 2: 
                objeto2.estaciones();
            break;
            case 3:
                objeto3.categorias();
            break;
            
        }
        System.out.println("Desea ver otra opcion? Si=1 No=2");
        a = sc.nextInt();
        }
        
    }
    
}
