/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        int primeiroNumero=sc.nextInt();
        int segundoNumero=sc.nextInt();
        int soma=primeiroNumero+segundoNumero;
        System.out.printf("SOMA = %d%n",soma);
        sc.close();
        
    }
    
}
