package taller1;

import java.util.Scanner;

public class Taller15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);


		System.out.println("Por favor ingrese el nùmero de ecuaciones lineales a trabajar");
		int ecuaciones=entrada.nextInt();
		System.out.println("Por favor ingrese la dimension de la ecuacion [2/3]");
		int dimension=entrada.nextInt();
		double [][]matriz1=new double[ecuaciones][dimension];
		double [][]matriz2=new double[ecuaciones][dimension];

		//matriz1
		for(int i=0;i<ecuaciones;i++) {
			for(int j=0;j<dimension;j++) {
				System.out.println("Ingrese el coeficiente de la x " + (j+1));				
				matriz1[i][j]= entrada.nextDouble();
			}
		}
		for(int z=0;z<ecuaciones;z++) {
			System.out.println();
			for(int h=0;h<dimension;h++) {
				System.out.print(matriz1[z][h] + " ");
				System.out.print("");
			}

		}
		//matriz2
		for(int i=0;i<ecuaciones;i++) {
			matriz2[i][i]=0;
			for(int j=0;j<ecuaciones;j++) {
				matriz2[j][j]=1;
			}
		}

		for(int z=0;z<ecuaciones;z++) {
			System.out.println();
			for(int h=0;h<dimension;h++) {
				System.out.print(matriz2[z][h] + " ");
				System.out.print("");
			}
		}
		System.out.println("");

		//Gauss
		double Vnumero1;
		double Vnumero2;


		for(int i=0;i<ecuaciones;i++){
			//Division de los coeficientes
			for(int j=0; j<ecuaciones;j++) {
				Vnumero1=matriz1[j][j];
				System.out.println(Vnumero1+"+++");
				System.out.println(j);
				for(int n=0;n<ecuaciones;n++) {
					matriz1[j][n]=matriz1[j][n]/Vnumero1;
					matriz2[j][n]=matriz2[j][n]/Vnumero1;
				}
				//Se imprime matriz1				
				for(int z=0;z<ecuaciones;z++) {
					System.out.println();
					for(int h=0;h<dimension;h++) {
						System.out.print(matriz1[z][h] + " ");
						System.out.print("");
					}

				}
				//Se imprime matriz2
				for(int z=0;z<ecuaciones;z++) {
					System.out.println();
					for(int h=0;h<dimension;h++) {
						System.out.print(matriz2[z][h] + " ");
						System.out.print("");
					}
				}
				System.out.println("");
				// Multiplicacion de los coeficientes

				for(int l=0;l<ecuaciones;l++) {
					Vnumero2=matriz1[l][j];
					if(Vnumero2==matriz1[j][j]) {
						matriz1[i][i]=matriz1[i][i];
						System.out.println(Vnumero2+"*");
					}else {
						System.out.println(Vnumero2+"---");
						for (int k=0;k<=ecuaciones-1;k++) {
							matriz1[l][k]=matriz1[l][k]-(Vnumero2*matriz1[j][k]);
							matriz2[l][k]=matriz2[l][k]-(Vnumero2*matriz2[j][k]);
						}
					}
					//Se imprime matriz1				
					for(int z=0;z<ecuaciones;z++) {
						System.out.println();
						for(int h=0;h<dimension;h++) {
							System.out.print(matriz1[z][h] + " ");
							System.out.print("");
						}
					}

					//Se imprime matriz2
					for(int z=0;z<ecuaciones;z++) {
						System.out.println();
						for(int h=0;h<dimension;h++) {
							System.out.print(matriz2[z][h] + " ");
							System.out.print("");
						}
					}
					System.out.println("");
				}



			}i=ecuaciones;
		}


	}

}