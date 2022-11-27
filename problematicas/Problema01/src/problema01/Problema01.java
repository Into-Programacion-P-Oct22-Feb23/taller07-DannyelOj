/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        String nombre;
        String posicion;
        String edades = "";
        double estatura = 0;
        double sumaEstatura = 0;
        int edad = 0;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;

        // contador para saber el número de iteraciones
        int contadorIteraciones = 0;
        // variables para promedio
        double promedioEdad;
        //double promedioEstatura;
        cadena= String.format("%s%s\n", cadena,
                "Listado de Jugadores");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();

            // sumo la edad a sumaEdades
            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;

            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1; // primera(0+1=1)
            edades = edades + edad + "\n";
            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadena= String.format("%s%d.) %s -%s-, edad %d, estatura %.2f\n",
                    cadena,
                    contadorIteraciones,
                    nombre,
                    posicion,
                    edad,
                    estatura);

            entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        } while (bandera);
        cadena = String.format("%sListado de edades\n%s",
                cadena, edades);
        promedioEdad = (double) sumaEdades / contadorIteraciones;
        sumaEstatura = sumaEstatura / contadorIteraciones;

        // Promedio de edades:  
        cadena = String.format("%sPromedio de edades: %.1f\n",
                cadena, promedioEdad);
        // Promedio de estaturas:  
        cadena= String.format("%sPromedio de estaturas: %.2f\n",
                cadena, sumaEstatura);

        // presentación de cadena final
        System.out.printf("%s\n", cadena);

    }

}