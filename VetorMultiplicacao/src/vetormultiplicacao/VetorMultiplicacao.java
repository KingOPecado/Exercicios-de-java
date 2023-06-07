/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetormultiplicacao;

import java.util.Scanner;

/**
 *
 * @author Glenn Marcos
 */
public class VetorMultiplicacao {

    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        
        int[] numbers = new int[10];
        int largestNumber = 0;
        int[] multipliedNumbers = new int[10];
        
        
        System.out.println("Digite os valores do primeiro vetor: ");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) + "- ");
            numbers[i] = scan.nextInt();
            
            if ((numbers[i] > largestNumber) || (i == 0)) {
                largestNumber = numbers[i];
            }
        }
        
        System.out.println("\n Valores multiplicados: ");
        
        for (int i = 0; i < multipliedNumbers.length; i++) {
            
            multipliedNumbers[i] = (numbers[i] * largestNumber);
            
            System.out.println(multipliedNumbers[i]);
        }
        
        
        
    }
    
}
