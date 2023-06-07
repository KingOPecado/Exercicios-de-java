/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Exercicio1 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       String[] nomes = new String[10];
       double[] medias = new double[10];
       
       double mediaTurma = 0;
       double somaMedia = 0;
       
       double mediaMaior = 0;
       String nomeMaior = nomes[0];
       
        System.out.println("Digite o nome dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + (i+1) + "° aluno");
            nomes[i] = scan.next();
        }
        
        System.out.println("Digite a média dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + (i+1) + "ª média");
            medias[i] = scan.nextDouble();
            
            somaMedia = (somaMedia + medias[i]);
        }
        
        mediaTurma = (somaMedia / 10);
        System.out.println("\n A média da turma é: " + mediaTurma);
        
        for (int i = 0; i < 10; i++) {
            if (medias[i] >= 6) {
                System.out.println("\n" + nomes[i] + " está acima da media");
            }
            if (medias[i] >= mediaTurma) {
                System.out.println("\n" + nomes[i] + " está acima da media da turma");
            }
            
            if (mediaMaior < medias[i]) {
                mediaMaior = medias[i];
                nomeMaior = nomes[i];
            }
        }
        
        System.out.println("\n O aluno: " + nomeMaior + " possui a maior media da sala");
        System.out.println("Maior media é: " + mediaMaior);
    }      
}