/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author VEL-USER
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 1;
        int suma = 3;
        String cadena = "";
        cadena = cadena + "1";
        
        while(contador <= 7){
            if(contador % 2 == 0){
                cadena = String.format("%s + 1/%d", 
                        cadena, suma);
            }else{
                cadena = String.format("%S - 1/%d", 
                        cadena, suma);
            }
            contador = contador + 1;
            suma = suma + 2;
        }
        System.out.println(cadena);
    }
    
}
