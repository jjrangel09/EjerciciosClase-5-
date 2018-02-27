/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConvSegundos;

import java.util.Scanner;

/**
 *
 * @author JuanJ
 */
public class Convertidor {

    /**
     *
     */
    public void Convertidor() {
        int desea = 1, segIng, temp, min = 60, segHr = (min * 60), segDia = (segHr * 24), segSem = (segDia * 7), segs, mins, hrs, dias, semanas;
        while (desea != 2) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el número de segundos (entero): ");
            segIng = sc.nextInt();
            temp = segIng % segSem;
            semanas = (segIng - temp) / segSem;
            segs = temp;
            temp = temp % segDia;
            dias = (segs - temp) / segDia;
            segs = temp;
            temp = temp % segHr;
            hrs = (segs - temp) / segHr;
            segs = temp;
            temp = temp % min;
            mins = (segs - temp) / min;
            segs = temp;

            if (semanas != 0) {
                System.out.println("Semanas:  " + semanas);
            }
            if (dias != 0) {
                System.out.println("dias:     " + dias);
            }
            if (hrs != 0) {
                System.out.println("horas:    " + hrs);
            }
            if (mins != 0) {
                System.out.println("minutos:  " + mins);
            }
            if (segs != 0) {
                System.out.println("Segundos: " + segs);
            }

            System.out.print("Desea ejecutar otra vez? Si=1 No=2: ");
            desea = sc.nextInt();
        }
    }
}
