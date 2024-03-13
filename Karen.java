/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.karen;

/**
 *
 * @author PC18
 */
import java.util.Scanner;
public class Karen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Programa para verificar si el numero es par o impar");
        System.out.println("de lo contrario no mostrará nada");
        System.out.println("Ingresa un numero");
        n=sc.nextInt();
        if (n%2==0){
        System.out.println("El numero es par");
        }
        else{
                System.out.println("El numero es impar");
                }
        sc.close();
}
}