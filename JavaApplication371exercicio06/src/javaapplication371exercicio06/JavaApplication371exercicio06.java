
package javaapplication371exercicio06;


public class JavaApplication371exercicio06 {

    
    


    public static boolean ehPalindromo(String texto) {
        if (texto == null) return false;

        String limpa = texto.replaceAll("\\s+", "").toLowerCase();

        int esquerda = 0;
        int direita = limpa.length() - 1;

        while (esquerda < direita) {
            if (limpa.charAt(esquerda) != limpa.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }


    public static void main(String[] args) {
        String exemplo1 = "Radar";
        String exemplo2 = "A base do teto desaba";

        System.out.println("\"" + exemplo1 + "\" é palíndromo? " + ehPalindromo(exemplo1));
        System.out.println("\"" + exemplo2 + "\" é palíndromo? " + ehPalindromo(exemplo2));
    }
}

        
        
        
        
        
        
        
    
    

