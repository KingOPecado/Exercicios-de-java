
package empresalevantamento;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class EmpresaLevantamento {


    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int idade;
        String sexo;
        String experiencia;
        int qtdeFeminino = 0;
        int qtdeMasculino = 0;
        int somaIdadeFeminina = 0;
        double mediaIdadeFeminina = 0;
        int menorIdadeMasculina = 0;
        int qtdeSemExperienciaFeminina = 0;
        
        for(int i = 1; i <= 4; i++){
              
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();
            
            System.out.println("Digite seu SEXO: (M ou F)");
            sexo = scan.next().toUpperCase();
            
            System.out.println("Digite sua experiencia de trabalho: (S/N)" );
            experiencia = scan.next().toUpperCase();
            
            if(sexo.equals("F") ){
                qtdeFeminino++;
            }else if(sexo.equals("M")){
                qtdeMasculino++;
            }
            
            if(sexo.equals("M") && (experiencia.equals("S"))){
               if (menorIdadeMasculina == 0){
                   menorIdadeMasculina = idade;
               }
               if (idade < menorIdadeMasculina){
                   menorIdadeMasculina = idade;
               }
            }
            
            if(sexo.equals("F") && (experiencia.equals("N"))){
                somaIdadeFeminina += idade;
                qtdeSemExperienciaFeminina++;
            }
        }
        
        mediaIdadeFeminina  = (double) somaIdadeFeminina/qtdeSemExperienciaFeminina;
        
        System.out.println("O número de candidatos do sexo feminino é :" + qtdeFeminino);
        System.out.println("\nO número de candidatos do sexo masculino é :" + qtdeMasculino);
        System.out.println("\nA menor idade masculina é :" + menorIdadeMasculina);
        System.out.println("\nA media de idade sem experiencia feminina é :" + mediaIdadeFeminina);
    } 
}
