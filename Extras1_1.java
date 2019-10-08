/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_1;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Extras1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner compra= new Scanner (System.in);
        int articulo;
        float precio, recibo;
        System.out.println("Nº de artículos =");
        articulo = compra.nextInt();
        System.out.println("Precio do artículo =");
        precio = compra.nextFloat();
        System.out.println("Pago con =");
        recibo = compra.nextFloat();
        System.out.println("MERCADONA"+"\nNº unidades ="+ articulo+"\nPrecio unidad ="+ precio+"\nTOTAL ="+ articulo*precio+"\nRecibo ="+ recibo+"\nDevolvo ="+ (recibo-articulo*precio)+"\nGRAZAS POR VIR");
    }
    
}
