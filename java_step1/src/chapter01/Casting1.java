package chapter01;

public class Casting1 {
	public static void main(String[] args) {
		int intVar = 10;
		long longVar;
		double dblVar;
		longVar = intVar;
		dblVar = longVar;  
		
		
		System.out.println("long nat casting : " + longVar);
		System.out.println("dbl nat casting : " + dblVar);
		dblVar = 10l;
		System.out.println("dbl alloc casting : " + dblVar);
		intVar = (int) dblVar;
		System.out.println("int forced casting : " + intVar);
	}
}
