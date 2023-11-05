/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author RUDDY
 */
public class Tienda {
    
    public static void main(String[] args) {
        int NHR=10;
        int CFIJO=300;
        int CUV = 75;
        int PVU = 50;
        int CHR =0;
        int TCART = 0;
        int CClie=0;
        int Cart=0;
        for(CHR=0;CHR<NHR;CHR++){
            double rllecli=Math.random();
            int llecli= (int) Math.round(1+5*rllecli);
            do{
               for(CClie=0;CClie<llecli;CClie++){
                   double rcart=Math.random();
                   if(0<rcart && rcart<0.20){
                   }else{
                       if(0.20<rcart && rcart<0.50){
                       Cart=1;
                   }else{
                   if(0.5<rcart && rcart<0.90){
                   Cart=2;
                   }else{
                   Cart=3;
                   }
                   }
                   }
               
                }
               CClie=0;
            }while(llecli==0);
        }
        int GNETA = Cart*(PVU-CUV)-CFIJO;
        
        System.out.println(GNETA);
        System.out.println(TCART);
    }
    
}
