/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc=new Scanner(System.in);
       double a,b,c,areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;
      
       a=sc.nextDouble();
       b=sc.nextDouble();
       c=sc.nextDouble();
       
       areaTriangulo=a*c/2;
       areaCirculo=Math.pow(c, 2)*Math.PI;
       areaTrapezio=((a+b)*c)/2;
       areaQuadrado=Math.pow(b, 2);
       areaRetangulo=a*b;
       
       System.out.printf("TRIANGULO:%.3f%n",areaTriangulo);
       System.out.printf("CIRCULO:%.3f%n",areaCirculo);
       System.out.printf("TRAPEZIO:%.3f%n",areaTrapezio);
       System.out.printf("QUADRADO:%.3f%n", areaQuadrado);
       System.out.printf("RETANGULO:%.3f%n",areaRetangulo);
    }
    
}
