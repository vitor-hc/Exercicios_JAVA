/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        double raio=sc.nextDouble();
        double area= Math.PI*Math.pow(raio,2);
        System.out.printf("A = %.4f%n",area);
    }
    
}
