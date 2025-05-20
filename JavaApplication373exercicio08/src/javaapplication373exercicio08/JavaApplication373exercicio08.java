
 
package javaapplication373exercicio08;


public class JavaApplication373exercicio08 {

    
    public static int[] main(String[] args) {
        
     

        int tamanho;
        tamanho = arrayOriginal.length;
        int[] arrayInvertido = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int[] arrayOriginal = null;
            arrayInvertido[i] = arrayOriginal[tamanho - 1 - i];
        }

        return arrayInvertido;
    }

   
    
      
            
        int[] numeros = {1, 2, 3, 4, 5};

        int[] resultado = inverterArray(numeros);

        System.out.print("Array invertido: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

    private int[] inverterArray(int[] numeros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


        
        
        
       

    }
    
}
