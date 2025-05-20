
package javaapplication370exercicio05;


public class JavaApplication370Exercicio05 {

   
    public static void main(String[] args) {



  if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }

        long resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    
    public static void main(String[] args) {
        int numero = 5; // exemplo
        long fatorial = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }
}


        
     
        
    }
    
}
