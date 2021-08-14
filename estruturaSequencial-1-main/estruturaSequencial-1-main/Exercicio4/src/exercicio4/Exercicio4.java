/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int hours=sc.nextInt();
        double price=sc.nextDouble();
        double salary=hours*price;
        System.out.printf("NUMBER = %d%n",number);
        System.out.printf("SALARY = U$%.2f%n",salary);
        sc.close();
        
    }
    
}
