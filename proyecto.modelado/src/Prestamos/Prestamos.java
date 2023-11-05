/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prestamos;

/**
 *
 * @author RUDDY
 */
public class Prestamos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int TDF = 21;
        double i = 0.035;
        double I;
        double k = 1000;
        int c=0;
        
        for(c=0;c<TDF;c++){
            I= k *i;
            k=k+I;
        }
        System.out.print(k);
    }
    
}
