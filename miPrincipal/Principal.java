package miPrincipal;

import java.util.Scanner;

public class Principal {
    public String getGreeting(){
        return "Hellow";
        }
    static Matriz m;
    public static void main(String[] args) {
            m = new Matriz();
		    int[][] a = { { 1, 3}, { -1, 0} };
		    int[][] b = { { 4, 5 }, { -1, 0}};
		    int[][] d = m.suma(a, b);
		    int[][] c = m.multiplica (a, b);
		    System.out.println("Leyendo matriz A…");
		    System.out.println("Leyendo matriz B…");
		    System.out.println("Sumando matrices:");
		    m.imprime(a);
		    System.out.println("+");
		    m.imprime(b);
		    System.out.println("=");
		    m.imprime(d);
		    ////////////////////////
		    System.out.println("Multiplicando matrices:");
		    m.imprime(a);
		    System.out.println(".");
		    m.imprime(b);
		    System.out.println("=");
		    m.imprime(c);
	}  

}