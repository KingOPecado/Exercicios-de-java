/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariovendedores;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class SalarioVendedores {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] nomes = {"Ivo", "Leia", "Susi", "Alan", "Ian", "Bia", "Gil"};
        double[] salariosBase = {3000.00, 2200.00, 2400.00, 2000.00, 2500.00, 2600.00, 3500.00};
        double[] vendas = {7000.00, 20000.00, 15000.00, 6000.00, 5000.00, 22000.00, 8000.00};
        char[] categorias = {'b', 'e', 'e', 'b', 'b', 'e', 'b'}; 
        double media = 0;
        double somaSalario = 0;
        int quantidadeE = 0;
        double vendaFinal = 0;
        double salarioFinal;
        
        char selecionaCategoria;
        double mediaCategoria = 0;
        double quantidadeCategoriaE = 0;
        double quantidadeCategoriaB = 0;
       
        char categoriaMenos = categorias[0];
        double menorVenda = vendas[0];
        String menorNome = nomes[0];
        
        
        
        System.out.println("\nMenu\n"
                    + "1 - Média\n"
                    + "2 - Salário\n"
                    + "3 - Porcentagem\n"
                    + "4 - Menor venda\n"
                    + "5 - Sair\n"
                    + "Digite a opção");
        
        
        for (int i = 0; i < 7; i++) {
           
            if (categorias[i] == 'e') {
                quantidadeE++;
                somaSalario = (somaSalario + salariosBase[i]);
                media = (somaSalario/quantidadeE);
                
                System.out.println("\n 2) Media Salario vendedor Externo: " + media);
            }
        }
        
        for (int i = 0; i < 7; i++) {
            if (categorias[i] == 'e') {
                vendaFinal = vendas[i]*0.20;
                salarioFinal = salariosBase[i] + vendaFinal; 
                System.out.println("\n 3) nome:" + nomes[i]);
                System.out.println("Salario Final: " + salarioFinal);
            }
            if (categorias[i] == 'b') {
                vendaFinal = vendas[i]*0.5;
                salarioFinal = salariosBase[i] + vendaFinal; 
                System.out.println("\n 3) nome:" + nomes[i]);
                System.out.println("Salario Final: " + salarioFinal);
        }
        }
        
            
            
            for (int i = 0; i < 7; i++) {
                if (menorVenda < vendas[i]) {
                    categoriaMenos = categorias[i];
                    menorVenda = vendas[i];
                    menorNome = nomes[i];
                }
            }
            System.out.println("o nome de quem fez a menor venda é: " + menorNome);
            System.out.println("a categoria da menor venda é: " + categoriaMenos);
    }
    }

