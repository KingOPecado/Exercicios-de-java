/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] nomes = {"José", "Maria", "Pedro", "Gustavo", "Melina", "Rodrigo", "Aline", "Silvia", "Luciana", "Lucio"};
        char[] sexos = {'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'F', 'M'};
        double[] salarios = {1500, 1500, 5000, 3000, 4000, 3500, 2700, 3000, 5000, 3500};
        
        double folhaPagamento = 0;
        double folhaPagamento2 = 0;
        
        double mediaSalarial = 0;
        double somaSalarial = 0;
        
        double reajuste = 0;
        
        double totalSalarioF = 0;
        
        String menorNome = nomes[0];
        double menorSalario = 0;
        
        for (int i = 0; i < 10; i++) {
            folhaPagamento = (folhaPagamento + salarios[i]);
        }
        System.out.println("O valor total da folha de pagamento da empresa é: " + folhaPagamento);
        
        for (int i = 0; i < 10; i++) {
            somaSalarial = (somaSalarial + salarios[i]);
            mediaSalarial = (somaSalarial / 10);
        }
        System.out.println("\n A media salarial da empresa é: " + mediaSalarial);
        
        System.out.println("\n Salario reajustado de todos os funcionarios");
        for (int i = 0; i < 10; i++) {
            if (salarios[i] < mediaSalarial) {
                reajuste = salarios[i] * 0.15;
                salarios[i] = salarios[i] + reajuste;
            } 
            if (salarios[i] > mediaSalarial) {
                reajuste = salarios[i] * 0.075;
                salarios[i] = salarios[i] + reajuste;
            }
            if (menorSalario > salarios[i]) {
                menorSalario = salarios[i];
                menorNome = nomes[i];
            }
            System.out.println(nomes[i] + " " + salarios[i]);
        }
        
        for (int i = 0; i < 10; i++) {
            folhaPagamento2 = (folhaPagamento2 + salarios[i]);
        }
        System.out.println("\n O valor da folha de pagamento atualizada é: " + folhaPagamento2);
        
        for (int i = 0; i < 10; i++) {
            if (sexos[i] == 'F'){
                totalSalarioF++;
            }
        }
        System.out.println("\n O total de salarios do sexo feminino é: " + totalSalarioF);
        
        System.out.println("\n O nome do funcionario com menor salario apos o reajuste é: " + menorNome);
    }
    
}
