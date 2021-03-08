package taller1;

import java.util.Scanner;

public class Taller6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner taller6 = new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("Por favor digite un angulo en RADIANES del cual desee hallar su coseno por medio de aproximacion");
		double x = taller6.nextInt();
		double errorEs=(0.5*Math.pow(10, -8)*100);
		int iteraciones=0;
		int potencia=0;
		double sumatoria=0;
		double valor;
		double errorabs=100;
		double anterior=0;

		do {
			valor =( Math.pow(-1, potencia) / factorial(2 * potencia)) * Math.pow(x, 2 * potencia);
			sumatoria = sumatoria + valor;
			if(iteraciones<=1) {
				errorabs=0;
				System.out.println("Error absoluto "+errorabs+" en la iteracion ("+iteraciones+")");
			}else { 
				errorabs=((((sumatoria-anterior))/sumatoria)*100);
				System.out.println("Error absoluto "+ Math.abs(errorabs)+" en la iteracion ("+iteraciones+")");
			}
			anterior=sumatoria;
			potencia=potencia+1;
			iteraciones = iteraciones + 1;
			System.out.println("#("+iteraciones+")");
			System.out.println("iteracion #("+iteraciones+") ="+valor);
			System.out.println("sumatoria es = "+sumatoria+" en la iteracion ("+iteraciones+")");

			if (errorabs!=0) {
				if(errorabs<errorEs)       	{  
					iteraciones=51;     
				}
			}

		} while (iteraciones<=50);




	}private static double factorial (int n) {
		double rta=1;

		for (int i = 2; i <=n; i++) {
			rta=i*rta;

		}return rta;}}


