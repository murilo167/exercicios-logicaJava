
package javaapplication368exercicio03;

import java.util.Scanner;


public class JavaApplication368exercicio03 {

    public static void main(String[] args) {
        
        
        
 



        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int tamanho = ler.nextInt();

        int[] numeros = new int[tamanho];

        System.out.println("Digite os números do array:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = ler.nextInt();
        }

        int resultado = maiorValorAbsoluto(numeros);
        System.out.println("Maior valor absoluto no array: " + resultado);
    }

    public static int maiorValorAbsoluto(int[] vetor) {
        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            int valorAbsoluto;

            if (vetor[i] < 0) {
                valorAbsoluto = -vetor[i]; // cálculo manual do valor absoluto
            } else {
                valorAbsoluto = vetor[i];
            }

            if (valorAbsoluto > maior) {
                maior = valorAbsoluto;
            }
        }

        return maior;
    }
}

        
    
    

