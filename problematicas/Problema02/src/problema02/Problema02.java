/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author VEL-USER
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 1;
        int secuencia = 2;
        int suma = 4;
        
        while(contador <= 10){
            System.out.println(secuencia);
            secuencia = secuencia + suma;
            suma = suma + 2;
            contador = contador + 1;
        }
    }
    
}
