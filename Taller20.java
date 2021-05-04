package taller1;

import java.util.Scanner;
import taller1.Gausjordan;

public class Taller20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sumatoriax=0;
		double sumatoriay=0;
		double xporx=0;
		double sumatoriax2=0;
		double xporx3=0;
		double sumatoriax3=0;
		double xporx4=0;
		double sumatoriax4=0;
		double multiplicacion=0;
		double sumatoriamultiplicacion=0;
		double xporxpory=0;
		double sumatoriaxporxpory=0;
		double promedioy=0;
		double promediox=0;
		double st=0;
		double sr=0;
		double sumatoriast=0;
		double sumatoriasr=0;
		int n=0;
		double a0=0;
		double a1=0;
		double a2=0;
		double sy=0;
		double sydivx=0;
		double r=0;

		Scanner sc = new Scanner(System.in);
		double x[]= {1,3,5,7,9,11,13};
		double y[]= {0.3,0.7,1.8,3,5,7.2,9.8};

		for(int i =0; i<x.length;i++) {
			sumatoriax=sumatoriax+x[i];
			xporx=Math.pow(x[i], 2);
			sumatoriax2=xporx+sumatoriax2;
			xporx3=x[i]*x[i]*x[i];
			sumatoriax3=xporx3+sumatoriax3;
			xporx4=x[i]*x[i]*x[i]*x[i];
			sumatoriax4=xporx4+sumatoriax4;
			n++;
		}promediox=sumatoriax/x.length;

		for(int i =0; i<y.length;i++) {
			sumatoriay=sumatoriay+y[i];
		}promedioy=sumatoriay/y.length;

		for(int i=0; i<x.length;i++) {
			multiplicacion=x[i]*y[i];
			sumatoriamultiplicacion=sumatoriamultiplicacion+multiplicacion;
			xporxpory=(x[i]*x[i])*y[i];
			sumatoriaxporxpory=sumatoriaxporxpory+xporxpory;
			st=Math.pow(y[i]-promedioy, 2);
			sumatoriast=sumatoriast+st;
		}
		System.out.println(n+"a0 +"+sumatoriax+"a1 + "+sumatoriax2+"a2 = "+sumatoriay);
		System.out.println(sumatoriax+"a0 + "+sumatoriax2+"a1 + "+sumatoriax3+"a2 = "+sumatoriamultiplicacion);
		System.out.println(sumatoriax2+"a0 + "+sumatoriax3+"a1 + "+sumatoriax4+"a2 = "+sumatoriaxporxpory);
		

		double[][] a = {{n, sumatoriax, sumatoriax2}, {sumatoriax, sumatoriax2, sumatoriax3}, {sumatoriax2, sumatoriax3, sumatoriax4}};
		double[] b = {sumatoriay, sumatoriamultiplicacion, sumatoriaxporxpory};

		double[] gaus = gaussJordan(a, b);

		//Se imprimen los resultados
		for (int i = 0; i < gaus.length; i++) {
			System.out.println("a" + (i ) + " = " + gaus[i]);
			if (i==0) {
				a0=gaus[i];
			}if (i==1) {
				a1=gaus[i];
			}if (i==2) {
				a2=gaus[i];}
		}
		
		for(int i =0; i<y.length;i++) {
			sr=Math.pow(y[i]-a0-a1*x[i]-a2*(Math.pow(x[i], 2)), 2);
			sumatoriasr=sumatoriasr+sr;}
			sy=Math.pow((sumatoriast/(n-1)), 0.5);
			sydivx=Math.pow(sumatoriasr/(n-(2+1)), 0.5);
			r=Math.pow(((sumatoriast-sumatoriasr)/sumatoriast), 0.5)*100;
			System.out.println("Sy = "+sy);
			System.out.println("Sy/x = "+sydivx);
			System.out.println("r = "+r+"%");
			System.out.println("y = ("+a0+") + ("+a1+")x + ("+a2+")x^2");}

	

	private static double[] gaussJordan(double[][] a, double[] b) {
		double[][] aAux = duplicarArreglo(a);
		double[] bAux = duplicarArreglo(b);

		int n = bAux.length;
		//Se construye la matriz identidad
		for (int i = 0; i < n; i++) {
			//Pivoteo
			if (aAux[i][i] == 0) {
				int indiceAux = i;
				for (int j = i + 1; j < n; j++) {
					if (aAux[j][i] != 0) {
						indiceAux = j;
						break;
					}
				}
				if (indiceAux != i) {
					double[] filaAux = aAux[i];
					aAux[i] = aAux[indiceAux];
					aAux[indiceAux] = filaAux;

					double valoAux = bAux[i];
					bAux[i] = bAux[indiceAux];
					bAux[indiceAux] = valoAux;
				}
			}

			//Normalización
			double divisorAux = aAux[i][i];
			for (int j = 0; j < n; j++) {
				aAux[i][j] /= divisorAux;
			}
			bAux[i] /= divisorAux;

			//Reducción
			for (int j = 0; j < n; j++) {
				if (i != j) {
					double fact = -aAux[j][i] / aAux[i][i];

					for (int k = 0; k < n; k++) {
						aAux[j][k] += (aAux[i][k] * fact);
					}

					bAux[j] += (bAux[i] * fact);
				}
			}
		}

		return bAux;
	}

	private static double[][] duplicarArreglo(double[][] m) {
		double[][] duplicado = new double[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			System.arraycopy(m[i], 0, duplicado[i], 0, m[i].length);
		}

		return duplicado;
	}

	private static double[] duplicarArreglo(double[] v) {
		double[] duplicado = new double[v.length];
		System.arraycopy(v, 0, duplicado, 0, v.length);

		return duplicado;
	}

	private static void imprimirEcuaciones(double[][] a, double[] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("| " + b[i]);
		}
	}



}
