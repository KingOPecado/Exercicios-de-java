/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] votos = new int[15];
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        
        System.out.println("Digite o seu voto: (15) Monteiro Lobato, (25) Euclides da Cunha, (35) Paulo Freire");
        for (int i = 0; i < 15; i++) {
            votos[i] = scan.nextInt();
            
            if (votos[i] == 15) {
                candidato1++;
            }
            if (votos[i] == 25) {
                candidato2++;
            }
            if (votos[i] == 35) {
                candidato3++;
            }
        }
        
        System.out.println("O candidato Monteiro Lobato possui " + candidato1 + " votos");
        System.out.println("O candidato Euclides da Cunha possui " + candidato2 + " votos");
        System.out.println("O candidato Paulo Freire possui " + candidato3 + " votos");
        
        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("\n O vencedor das eleições foi Monteiro Lobato");
        }
        else if (candidato2 > candidato1 && candidato2 > candidato3) {
            System.out.println("\n O vencedor das eleições foi Euclides da Cunha");
        }
        else if (candidato3 > candidato1 && candidato3 > candidato2) {
            System.out.println("\n O vencedor das eleições foi Paulo Freire");
        }
        else{
            System.out.println("\n Não ouve ganhadores pois os votos ficaram empatados");
        }
    }
    
    
//    Tive que deixar nomeado como exercicio 4 pois já possuia um exercicio 3 na pasta onde fiz esse.
}
