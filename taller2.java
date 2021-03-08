/**
 * 
 */
package taller1;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author 57316
 *
 */
public class taller2 {

	

	/**
	 * 
	 */
	public taller2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		       
			Scanner sc = new Scanner(System.in);
		    HashSet<Integer> conjunto1 = new HashSet<>();
			
		    {
				conjunto1.add(6);conjunto1.add(17);
				conjunto1.add(7);conjunto1.add(18);
				conjunto1.add(8);conjunto1.add(19);
				conjunto1.add(9);conjunto1.add(20);
				conjunto1.add(10);conjunto1.add(21);
				conjunto1.add(11);conjunto1.add(22);
				conjunto1.add(12);conjunto1.add(23);
				conjunto1.add(13);conjunto1.add(24);
				conjunto1.add(14);
				conjunto1.add(15);
				conjunto1.add(16);}
			
			System.out.println("A = " + conjunto1);

		    HashSet<Integer> conjunto2 = new HashSet<>();

		     {
			conjunto2.add(29);conjunto2.add(13);
			conjunto2.add(27);conjunto2.add(11);
			conjunto2.add(25);conjunto2.add(9);
			conjunto2.add(23);conjunto2.add(7);
			conjunto2.add(21);conjunto2.add(5);
			conjunto2.add(19);conjunto2.add(3);
			conjunto2.add(17);
			conjunto2.add(15);}

		    System.out.println("B = " + conjunto2);
		    
		    HashSet<Integer> conjunto3 = new HashSet<>();

		     {
			
			conjunto3.add(0);conjunto3.add(11);
			conjunto3.add(3);conjunto3.add(15);
			conjunto3.add(6);conjunto3.add(18);
			conjunto3.add(9);conjunto3.add(20);}
		    System.out.println("C = " + conjunto3);
		    
		    HashSet<Integer> conjunto4 = new HashSet<>();

		     {
			
			conjunto4.add(2);conjunto4.add(11);conjunto4.add(23);
			conjunto4.add(3);conjunto4.add(13);conjunto4.add(29);
			conjunto4.add(5);conjunto4.add(17);conjunto4.add(31);
			conjunto4.add(7);conjunto4.add(19);conjunto4.add(37);}
		    System.out.println("D = " + conjunto4);
		    
		    System.out.println("");
			System.out.println("Resolver las siguientes operaciones: ");
			System.out.println("");
			System.out.println("(AOB)nC");
			System.out.println("");
			System.out.println(interseccion(conjunto3,(diferenciasimetrica(conjunto1,conjunto2))));	
			System.out.println("(A-C)uB");
			System.out.println("");
			System.out.println(union(conjunto2,(diferencia(conjunto1,conjunto3))));
			System.out.println("AO(CuD)");
			System.out.println("");
			System.out.println(diferenciasimetrica(conjunto1,(union(conjunto3,conjunto4))));
			System.out.println("(C-A)O(BnD)]");
			System.out.println("");
			System.out.println((diferenciasimetrica((diferencia(conjunto3,conjunto1)),(union(conjunto2,conjunto4)))));
	}
		   
			        
	
		//UNION
	private static HashSet<Integer> union(HashSet<Integer>conjunto1,HashSet<Integer>conjunto2){
		HashSet<Integer> conjuntoUnion = new HashSet<>();
		for (int elemento : conjunto1) {
			conjuntoUnion.add(elemento);
		}
		for (int elementoB : conjunto2) {
			conjuntoUnion.add(elementoB);
		}

		return conjuntoUnion;
		    
		    }
		    
		    //INTERSECCION
	private static HashSet<Integer> interseccion(HashSet<Integer>conjunto1,HashSet<Integer>conjunto2){

		    HashSet<Integer> interseccion = new HashSet<>();
		    {
            for (int e : conjunto1) {
                for (int h : conjunto2) {
                    if (e == h) {
                        interseccion.add((Integer) e);
                    }
                }
            }
		    	return interseccion;}
		    }
		    
		    //DIFERENCIA
		    private static HashSet<Integer>diferencia(HashSet<Integer>conjunto1,HashSet<Integer>conjunto2){
				int temp=0;
				HashSet<Integer> conjuntoDif = new HashSet<>();
				for (int elemento : conjunto1) {						
					for (int elementoB : conjunto2) {
						if	(elemento == elementoB) {	
							temp=1;								
						}							
					}
					if(temp==0) {
						conjuntoDif.add(elemento);
					}
					temp=0;
					
				}
				return conjuntoDif;
			}
		    //DIFERENCIA SIMETRICA
			private static HashSet<Integer>diferenciasimetrica(HashSet<Integer>conjunto1,HashSet<Integer>conjunto2){
				int temp2=0;

				HashSet<Integer> conjuntoDifSime = new HashSet<>();
				for (int elemento : conjunto1) {						
					for (int elementoB : conjunto2) {
						if	(elemento == elementoB){	
							temp2=1;	
						}
					}
					if(temp2==0) {
						conjuntoDifSime.add(elemento);
					}
					temp2=0;
				}
				temp2=0;

				for (int elemento : conjunto2) {						
					for (int elementoB : conjunto1) {
						if	(elemento == elementoB) {	
							temp2=1;								
						}							
					}
					if(temp2==0) {
						conjuntoDifSime.add(elemento);
					}
					temp2=0;


				
				}
				return conjuntoDifSime;
			}

		}

            
