package taller1;

public class Taller12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=Math.E;
		double serie=0;
		double xi=0.75;
		double h=0.005;
		double xih=xi+h;
		double f=potencia(e,-xi);
		
		for (int i=0;i<=15;i++) {
			System.out.println(division(f*potencia(h,i),factorial(i)));
			serie=serie+division(f*potencia(h,i),factorial(i));
			
			System.out.println("orden "+i+" ; ");
			System.out.println("f("+xih+") = "+serie);
			
			f=(-1*f);
		}

		
		}
		

	private static double potencia(double n, double x) {
		double potencia=Math.pow(n, x);
		return potencia;}
	
	private static double division(double o, double q) {
		double division=o/q;
		return division;}
	
	private static double factorial(int g) {
		double factorial=1;
		
		for (int i =1;i<=g; i++) {
			factorial=i*factorial;}
		
		return factorial;}
	

}
