/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import static java.lang.Math.round;

/**
 *
 * @author RUDDY
 */
public class Dados {
    public static void main(String[] args) {
        for(int i =0;i<=30;i++){
        int NJM = 100;
        int CUJ = 2;
        int PUJ = 5;
        int CJUE = 0;
        int GNETA= 0;
        int NJC= 0;
        for(CJUE=0;CJUE<NJM;CJUE++){
        double rd1=Math.random();
        double rd2=Math.random();
            int dado1= (int) Math.round(1+5*rd1);
            int dado2= (int) Math.round(1+5*rd2);
        int sdado=(dado1+dado2);
        if(sdado==7){
            GNETA=GNETA+CUJ+PUJ;
        }else{
            GNETA=GNETA+CUJ;
            NJC=NJC+1;
            }
        }
        double PJC=(NJC%NJM);
        System.out.println("Porcentaje de juegos que gana la casa: "+PJC);
        System.out.println("Ganancia Neta: "+GNETA);
        System.out.println("Numero de juegos que gana la casa: "+NJC);
        
        
        }
    }
}
