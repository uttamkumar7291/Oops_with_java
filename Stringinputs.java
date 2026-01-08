/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringinputs;

/**
 *
 * @author uttam
 * 
 */
import java.util.Scanner;

public class Stringinputs {

    public static void main(String[] args) {
        System.out.println("Wellcome to code with uttam kumar  : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of strings : ");
        String a = sc.nextLine();
        System.out.println("your string value is : "+ a);
      
        System.out.println("\nEnter the value of integers : ");
        int b = sc.nextInt();
        System.out.println("your integers value is : "+ b);
        
        System.out.println("\nEnter the value of float : ");
        float c = sc.nextFloat();
        System.out.println("your float value is : "+ c);
        
        
        
    }
}
