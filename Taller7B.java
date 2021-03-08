package taller1;

import java.util.Scanner;

public class Taller7B {
	//segundo programa

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner taller7 = new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("Por favor digite un angulo en RADIANES del cual desee hallar su coseno por medio de aproximacion");
		double x = taller7.nextInt();
		double errorEs=(0.5*Math.pow(10, -7)*100);
		int iteraciones=0;
		int potencia=0;
		double valor=0;
		double errorabs=100;
		

		do {
			double anterior= valor;
			if (iteraciones<=1) {
				valor += 1/1;
			}else if (iteraciones==2) {
				valor += 1/x;
			}else if (iteraciones>=3) {
			valor += Math.pow(x, potencia) / factorial(potencia);
			}
			errorabs= 1/Math.abs((valor-anterior)/valor) * 100;
			iteraciones++;
			potencia +=1;
		} while (errorabs<=errorEs);
		
		System.out.println("cos (" + x +") =" +valor);
		System.out.println("Error aproximado relativo porcentual = "+errorabs+"%");
		System.out.println("# de Iteraciones ("+iteraciones+")");




	}private static double factorial (int n) {
		double rta=1;

		for (int i = 1; i <=n; i++) {
			rta=i*rta;

		}return rta;}

	}