
package javaapplication367exercicio02;

import java.util.Scanner;

public class JavaApplication367exercicio02 {

   
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String entrada = ler.nextLine();

        String resultado = substituirVogaisPorAsterisco(entrada);
        System.out.println("Frase modificada: " + resultado);
    }

    public static String substituirVogaisPorAsterisco(String texto) {
        char[] caracteres = texto.toCharArray();
        String novaString = "";

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                novaString += '*';
            } else {
                novaString += c;
            }
        }

        return novaString;
    }
}
 
        
        
        
        
        
        
        
        
        
      
    }
    
}
