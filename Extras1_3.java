/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_3;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Extras1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //REaliza un programa que lea un nº de tres cifras e amose por pantalla as cifras do nº.
        
        Scanner cifras = new Scanner (System.in);
        int abc;
        System.out.println("Nº =");
        abc = cifras.nextInt();
        System.out.println("As cifras son as seguintes:"+"\na ="+ abc/100+"\nb ="+ abc%100/10+"\nc ="+ abc%100%10/1);
        
        
    }
    
}
