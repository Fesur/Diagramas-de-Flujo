/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pollos;
import java.io.*;
import java.math.*;
/**
 *
 * @author RUDDY
 */



public class Pollo {

	public static void main(String args[]) {
		int cdia;
		double chuep;
		int cthpg;
		int ctpo;
		int ingp;
		int ingt;
		double m;
		double n;
		int ndia;
		int pvh;
		int pvp = 0;
		double repo;
		double rhue;
		int thue = 0;
		int thuer;
		int tpm;
		double tpov = 0;
		ndia = 10;
		pvh = 2;
		pvh = 30;
		cdia = 0;
		thuer = 0;
		cthpg = 0;
		ctpo = 0;
		tpm = 0;
		chuep = 0;
                int i =0;
                do{ i++;
		do {    
			cdia = cdia+1;
			n =Math.random()*1+0.000;
			if (0<=n && n<=0.135) {
				chuep = 1;
			} else {
				if (0.135<=n && n<=0.679) {
					chuep = 2;
				} else {
					if (0.679<=n && n<=0.857) {
						chuep = 3;
					} else {
						if (0.857<=n && n<=0.947) {
							chuep = 4;
						} else {
							if (0.947<=n && n<=0.983) {
								chuep = 5;
							} else {
								if (0.983<=n && n<=0.995) {
									chuep = 6;
								} else {
									if (0.995<=n && n<=0.998) {
										chuep = 7;
									} else {
										chuep = 8;
									}
								}
							}
						}
					}
				}
			}
			cthpg = (int) (cthpg+chuep);
			do {
				rhue=Math.random()*1+0.000;
				if (0<=rhue && rhue<=0.2) {
					thuer = thuer+1;
				} else {
					if (0.2<=rhue && rhue<=0.5) {
						repo =Math.random()*1+0.000;
						if (0<=repo && repo<=0.2) {
							tpm = tpm+1;
						} else {
							tpov = tpov+1;
						}
					} else {
						thue = thue+1;
						chuep = chuep-1;
					}
				}
			} while (chuep!=0);
		} while (cdia!=ndia);
		ingt = (int) (tpov*pvp+thue*pvh);
		ingp = ingt/ndia;
		System.out.println(ingt+ingp);
                
                }while(i==9);
	}


}

    
    

