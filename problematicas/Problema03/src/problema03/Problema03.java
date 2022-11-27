/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
/**
 *
 * @author VEL-USER
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 2;
        int contador = 3;
        String serie = " "; 
        do {     
            serie = serie + numero + "\n";
            numero = numero + contador;
            contador = contador + 2;
            
        } while (numero <38);
        System.out.printf("%s\n",serie);
    }
    
}
