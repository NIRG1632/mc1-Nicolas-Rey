package taller1;

import java.util.Scanner;
import java.util.Arrays;

public class Taller13B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de filass de la Matriz A");
        int FA = sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la Matriz A");
        int CA = sc.nextInt();
        System.out.println("Ingresa el numero de filas de la Matriz B");
        int FB = sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la Matriz B");
        int CB = sc.nextInt();
        int A[][] = new int[FA][CA];
        int B[][] = new int[FB][CB];
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.println("Ingresa un valor para la posicion " + i + "," + j);
                A[i][j] = sc.nextInt();
            }
        }
        for(int k = 0; k < B.length; k++){
            for(int l = 0; l < B[0].length; l++){
                System.out.println("Ingresa un valor para la posicion " + k + "," + l);
                B[k][l] = sc.nextInt();
            }
        }
        System.out.println("\n 1. Sumar \n 2. Restar \n 3. Multiplicacion Escalar \n 4. Multiplicacion de Matrices \n Seleccion una opcion");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1: 
            	for(int i = 0; i < A.length; i++){
                    for(int j = 0; j < A[0].length; j++){
                        A[i][j] = A[i][j] * 3;
                    }
                }
                System.out.println(Arrays.deepToString(A));
                
            ;break; 
            
            case 2:
            	for(int i = 0; i < B.length; i++){
                    for(int j = 0; j < B[0].length; j++){
                        B[i][j] = B[i][j] * 4;
                    }
                }
            System.out.println(Arrays.deepToString(B));
            ;break;	
               
            case 3: 
            	 if(FA == FB && CA == CB){
                     int C[][] = new int[FA][CA];
                     for(int i = 0; i < A.length; i++){
                         for(int j = 0; j < A[0].length; j++){
                             C[i][j] = A[i][j] + B[i][j];
                         }
                     }
                     System.out.println(Arrays.deepToString(C));
                 }else{
                     System.out.println("Las Matrices no se pueden sumar");
                 }
            ;break;
            case 4: 
                if(CA == FB){
                    int C[][] = new int[FA][CB];
                    for(int i = 0; i < FA; i++){
                            for(int j = 0; j < CB; j++){
                                for(int k = 0; k < FB; k++){
                                    C[i][j] += A[i][k] * B[k][j];
                                }
                            }
                        }
                    System.out.println(Arrays.deepToString(C));
                }else{
                    System.out.println("Las Matrices no se pueden Multiplicar");
                }
            ;break;
            
            default: 
                System.out.println("El numero ingresado es erróneo");
            ;break;
        } 
    }
}
