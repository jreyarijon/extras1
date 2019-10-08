/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_2;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Extras1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Calcular o area dun círculo utilizando a librería Math para PI y para r²//
        
        Scanner circulo= new Scanner (System.in);
        float radio;
        System.out.println("Radio =");
        radio = circulo.nextFloat();
        System.out.println("Area do circulo ="+ Math.PI*Math.pow(radio,2));
    }
    
}
