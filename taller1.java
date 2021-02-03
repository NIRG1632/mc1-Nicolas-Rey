package taller1;
import java.util.Scanner;

import java.util.HashSet;

public class Taller1mc {
	

public static void main(String[] args) {
	       
	Scanner sc = new Scanner(System.in);
    HashSet<Integer> conjunto1 = new HashSet<>();
	
	for (int i=0; i<5; i++ ) {
		System.out.print("un numero para el conjunto 1: ");
		int aux = sc.nextInt();
		
		conjunto1.add(aux);}
	
	System.out.println("1 = " + conjunto1);

    HashSet<Integer> conjunto2 = new HashSet<>();

    for (int i=0; i<5; i++ ) {
	System.out.print("un numero para el conjunto 2: ");
	
	int aux2 = sc.nextInt();
	
	
	conjunto2.add(aux2);}

    System.out.println("2 = " + conjunto2);
{
	        
	        System.out.println("¿Que operacion desea realizar?");
	        System.out.println("1. Union");
	        System.out.println("2. Interseccion");
	        System.out.println("3. Diferencia");
	        System.out.println("4. Diferencia simetrica");
	        int n = sc.nextInt();

	        switch (n) {
	        case 1:
                HashSet<Integer> union = new HashSet<>();

                for (int i = 0; i < conjunto1.size(); i++) {
                    for (Object e : conjunto1) {
                        union.add((Integer) e);
                    }
                }
                for (int i = 0; i < conjunto2.size(); i++) {
                    for (Object e : conjunto2) {
                        union.add((Integer) e);
                    }
                }

                System.out.println("A U B = " + union);

                break;
	            case 2:
	                HashSet<Integer> interseccion = new HashSet<>();
	                for (Object e : conjunto1) {
	                    for (Object h : conjunto2) {
	                        if (e == h) {
	                            interseccion.add((Integer) e);
	                        }
	                    }
	                }
	                System.out.println("A n B = " + interseccion);
	                
	                break;

	            case 3:
	                HashSet<Integer> diferencia = new HashSet<>();
	                for (Object e : conjunto1) {
	                    if (conjunto2.contains(e)) {
	                        diferencia.add((Integer) e);
	                    }

	                }
	                System.out.println("A - B = " + diferencia);

	                break;

	            case 4:
	                HashSet<Integer> difsimetrica = new HashSet<>();

	                for (Object e : conjunto1) {
	                    if (conjunto2.contains(e)) {
	                        difsimetrica.add((Integer) e);
	                    }
	                }
	                for (Object e : conjunto2) {
	                    if (conjunto1.contains(e)) {
	                        difsimetrica.add((Integer) e);
	                    }
	                }
	                System.out.println("diferencia simetrica entre A y B = " + difsimetrica);
	        
	                break;

	        }
	         System.out.println("Quiere realizar otra operacion?"
	                 + " 1= si, 2=no");
	         int otra= sc.nextInt();
	         if (otra==1){

	         }
	         
	        }
	       
	        
	    }
	}
	