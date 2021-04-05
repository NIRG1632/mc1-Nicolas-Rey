package taller1;

import java.util.Scanner;

public class Taller13A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Por favor ingrese la longitud del vector1");
		int longitud1= entrada.nextInt();

		System.out.println("Por favor ingrese la longitud del vector2");
		int longitud2= entrada.nextInt();

		int[] vector1 = new int[longitud1];

		for(int i=0;i<longitud1;i++) {
			System.out.println("Por favor ingrese la posición " + (i+1) + " para el vector1");
			vector1[i]=entrada.nextInt();
		}
		System.out.print("(");
		for(int elemento:vector1){
			System.out.print(elemento + " ");
		}
		System.out.println(")");

		System.out.println("");
		int[] vector2 = new int[longitud2];

		for(int i=0;i<longitud2;i++) {
			System.out.println("Por favor ingrese la posición " + (i+1) + " para el vector2");
			vector2[i]=entrada.nextInt();
		}
		System.out.print("(");
		for(int elemento2:vector2){
			System.out.print(elemento2 + " ");
		}
		System.out.println(")");
		System.out.println("");

		int punto=0;
		if(longitud1==longitud2) {

			for(int i=0; i<longitud1;i++) {
					int producto=vector1[i]*vector2[i];
					punto=punto+producto;			
				}
			System.out.println("vecto1 . vector2 = "+ punto);
	} else {
		System.out.println("Las longitudes de los vectores no son iguales, por lo tanto no se puede hacer producto punto");
	}
}



	}

