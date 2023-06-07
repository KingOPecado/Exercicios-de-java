/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorvestibular;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class VetorVestibular {

    
    public static void main(String[] args) {
        
        final int NUMBER_OF_STUDENTS = 1200;
        final int NUMBER_OF_QUESTIONS = 100;
        final int PASSING_SCORE = 60;
        
        Scanner scan = new Scanner(System.in);
        
        int[] grades = new int[NUMBER_OF_STUDENTS];
        int correct = 0;
        String[] names = new String[NUMBER_OF_STUDENTS];
        String[] situations = new String[NUMBER_OF_STUDENTS];
        int[] ids = new int[NUMBER_OF_STUDENTS];
        char[] feedback = new char[NUMBER_OF_QUESTIONS];
        char[] studentAnswers = new char[NUMBER_OF_QUESTIONS];
        
        
        System.out.println("Entre com as respostas do gabarito: ");
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.print((i+1) + "-");
            feedback[i] = scan.next().toLowerCase().charAt(0);
        }
        
        System.out.println("Entre com as informações de cada aluno");
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            
            correct = 0;
            
            System.out.println((i + 1) + "° aluno: ");
            
            System.out.println("ID:");
            ids[i] = scan.nextInt();
            
            System.out.println("nome: ");
            names[i] = scan.next();
            
            System.out.println("Respostas do aluno");
            for (int j = 0; j < NUMBER_OF_QUESTIONS; j++) {
                
                System.out.println((j + 1) + "ª - ");
                studentAnswers[j] = scan.next().toLowerCase().charAt(0);
                
                if (studentAnswers[j] == feedback[j]) {
                    correct++;
                }
                
                if (correct < PASSING_SCORE) {
                    situations[i] = "Reprovado";
                } else{
                    situations[i] = "Aprovado";
                }
            }
            
            grades[i] = correct;
        }
        
        System.out.println("Resultados");
        System.out.printf("%10s %10s %10s %10s %n%n", "Id", "Nome", "Nota", "Situação");
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.printf("%10d %10s %10d %10s %n",
                        ids[i], names[i], grades[i], situations[i]);
        }
    }
    
}
