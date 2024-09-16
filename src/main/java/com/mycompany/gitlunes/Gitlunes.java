
package com.mycompany.gitlunes;

public class Gitlunes {

    public static void main(String[] args) {
        
        try {
            int[] numeros = {1, 2, 3};
            System.out.println("Accediendo: "+ numeros[3]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice fuera de los limitides");
        }
        
        System.out.println("Fin del programa");
        
       
                
    }
}
