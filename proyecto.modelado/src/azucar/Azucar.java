package azucar;
import java.io.*;
import java.math.*;

public class Azucar {

	public static void main(String args[]) {
		int c=0;
                do{
                c++;
                double cadq;
		int cbod;
		int cd;
		int cord;
		int cordt;
		double ctm;
		double cuad;
		double cuinv;
		double dazu = 0;
		int dint = 0;
		double gnetat;
		double ibru;
		double invazu;
		int nmd;
		double pazu = 0;
		int puv;
		double rdazu;
		double rtent;
		double tent;
		nmd = 27;
		cbod = 700;
		cord = 100;
		cuinv = 0.1;
		cuad =  3.5;
		puv = 5;
		cd = 0;
		ibru = 0;
		ctm = 0;
		invazu = 700;
		cadq = 2450;
		cordt = 100;
		tent = 0;
		do {
			cd = cd+1;
			if (tent==0) {
				if (cd%7==0) {
					pazu = cbod-invazu;
					cadq = cadq+(pazu*cuad);
					rtent = Math.random();
                                        System.out.print(rtent);
					tent = Math.round(rtent);
				} else {
					if (tent==0) {
						invazu = invazu+pazu;
						cordt = cordt+cord;
					} else {
						rdazu = Math.random();
						dazu =  Math.round((-100*Math.log1p(rdazu)));
					}
					if (dazu==0) {
						ctm = ctm+invazu*cuinv;
					} else {
						if (dazu>invazu) {
							dint = (int) (dint+dazu-invazu);
							if (invazu==0) {
								if (cd==nmd) {
									gnetat = ibru-cadq-cordt-ctm;
								}
							} else {
								ibru = ibru+invazu*puv;
								invazu = 0;
							}
						} else {
							ibru = ibru+dazu*puv;
							invazu = invazu-dazu;
						}
						ctm = ctm+invazu*cuinv;
					}
				}
			}
		} while (cd!=nmd);
            double GNETAT = ibru-cadq-cordt-ctm;
            System.out.println(GNETAT);
            System.out.println(dint);
            }while(c!=30);
                }


}

