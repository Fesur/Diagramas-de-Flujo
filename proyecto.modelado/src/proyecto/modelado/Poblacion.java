/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelado;

/**
 *
 * @author RUDDY
 */
public class Poblacion {
    public static void main(String[] args) {
    int Tmax = 3; // anios
    int c=0; // contador
    double tnac= 0.0301; // tasa de nacimiento
    double tmue= 0.00863; // tasa de muertes
    int pbol= 12079472; // poblacion de 2021
    double nac = pbol*tnac; // nacimientos
    double mue= pbol * tmue; // muertes
    
    
    for(c=0;c<Tmax;c++){
          nac=pbol * tnac;
          System.out.println("Nacimientos: "+nac);
          mue= pbol * tmue;
          System.out.println("muertes: "+mue);
          pbol = (int) (pbol + nac-mue);
          System.out.println("poblacion: "+pbol);
        }
    
    }
}
