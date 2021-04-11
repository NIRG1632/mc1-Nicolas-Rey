package pruebas;
import java.util.Scanner;
public class Taller14 {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);


		System.out.println("Por favor ingrese el nùmero de ecuaciones lineales a trabajar");
		int ecuaciones=entrada.nextInt();
		System.out.println("Por favor ingrese la dimension de la ecuacion [2/3]");
		int dimension=entrada.nextInt();
		double [][]matriz1=new double[ecuaciones][dimension];
		double [][]matriz2=new double[ecuaciones][1];

		for(int i=0;i<ecuaciones;i++) {
			for(int j=0;j<dimension;j++) {
				System.out.println("Ingrese el coeficiente de la x " + j +" para la ecuacion " + i);				
				matriz1[i][j]= entrada.nextDouble();
			}

		}
		for(int i=0;i<ecuaciones;i++) {
			for(int w=0;w<1;w++) {
				System.out.println("Ingrese el coeficiente de la ecuacion " + i);		
				matriz2[i][w]= entrada.nextDouble();
			}}

		for(int z=0;z<ecuaciones;z++) {
			System.out.println();
			for(int h=0;h<dimension;h++) {
				System.out.print(matriz1[z][h] + " ");
				System.out.print("");
			}

		}
		for(int z=0;z<ecuaciones;z++) {
			System.out.println(); 
			for(int h=0;h<1;h++) {
				System.out.print("|");

				System.out.print("");
			}		
		}

		for(int z=0;z<ecuaciones;z++) {
			System.out.println(); 
			for(int h=0;h<1;h++) {
				System.out.print(matriz2[z][h] + " ");

				System.out.print("");
			}		
		}

		double[][]Vmatriz= matriz1;
		double[][]Vmatriz2= matriz2;
		double Vnumero;

		for(int i =0; i<=Vmatriz.length-1;i++) {
			Vnumero=Vmatriz[i][i];
			for(int j=0;j<=matriz1[0].length-1;j++) {
				Vmatriz[i][j]=Vmatriz[i][j]/Vnumero;
				Vmatriz2[i][0]=Vmatriz2[i][0]/Vnumero;
				

				for(int z=0;z<ecuaciones;z++) {
					System.out.println();
					for(int h=0;h<dimension;h++) {
						System.out.print(Vmatriz[z][h] + " ");
						System.out.print("");
					}
				}
				for(int z=0;z<ecuaciones;z++) {
					System.out.println(); 
					for(int h=0;h<1;h++) {
						System.out.print("|");

						System.out.print("");
					}		
				}

				for(int z=0;z<ecuaciones;z++) {
					System.out.println(); 
					for(int h=0;h<1;h++) {
						System.out.print(matriz2[z][h] + " ");

						System.out.print("");
					}		
				}
				System.out.println();
			}

			if(i<=Vmatriz.length-2) {
				for(int j=i+1; j<=Vmatriz.length-1;j++) {
					Vnumero=Vmatriz[j][i];
					for(int k=0; k<=Vmatriz[0].length-1;k++) {
						Vmatriz[j][k]=(Vmatriz[j][k]-(Vnumero*Vmatriz[i][k]));
						
					}
				}
			}
		}
		for(int i=Vmatriz.length-1;i>=1;i--) {
			for(int j=i-1;j>=0;j--) {
				Vnumero=Vmatriz[j][i];
				for(int k=Vmatriz[0].length-1;k>=0; k--) {
					Vmatriz[j][k]=(Vmatriz[j][k]-(Vnumero*Vmatriz[i][k]));
					Vmatriz2[j+1][0]=(Vmatriz2[j][0]-(Vnumero*Vmatriz2[i][0]));
				}
			}
		}
		for(int i=0;i<ecuaciones;i++) {
			for(int j=i+1; j<=Vmatriz.length-1;j++) {
				Vnumero=Vmatriz[j][i];
				for(int k=0; k<=Vmatriz[0].length-1;k++) {
					Vmatriz2[j][0]=(Vmatriz2[j][0]-(Vnumero*Vmatriz2[i][0]));
					
			}
		}}
		for(int z=0;z<ecuaciones;z++) {
			System.out.println();
			for(int h=0;h<dimension;h++) {
				System.out.print(Vmatriz[z][h] + " ");
				System.out.print("");
			}
			}
		System.out.println("");
		
	
		for(int z=0;z<ecuaciones;z++) {
			System.out.println(); 
			for(int h=0;h<1;h++) {
				System.out.print("|");

				System.out.print("");
			}		
		}

		for(int z=0;z<ecuaciones;z++) {
			System.out.println(); 
			for(int h=0;h<1;h++) {
				System.out.print(matriz2[z][h] + " ");

				System.out.print("");
			}		
		}
	}
}
