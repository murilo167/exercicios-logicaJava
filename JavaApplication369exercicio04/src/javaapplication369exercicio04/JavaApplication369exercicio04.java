
package javaapplication369exercicio04;

public class JavaApplication369exercicio04 {


    public static void main(String[] args) {



        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de strings:");
        int n = ler.nextInt();
        ler.nextLine();  // Para consumir a nova linha após a leitura de um inteiro

        String[] strings = new String[n];

        System.out.println("Digite as strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = ler.nextLine();
        }

        String resultado = stringComMaiorNumeroDeVogais(strings);
        System.out.println("A string com o maior número de vogais é: " + resultado);
    }

    public static String stringComMaiorNumeroDeVogais(String[] array) {
        String string

      
    }
    
}
