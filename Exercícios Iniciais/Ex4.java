import java.util.Scanner;
public class Ex4 {
	
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Salário fixo ");
	int sal = scan.nextInt();
	System.out.println("Carros vendidos ");
	int car = scan.nextInt();
	System.out.println("Valor total da vendas ");
	int totalvendas = scan.nextInt();
	System.out.println("Valor por carro vendido");	
	int valorpc = scan.nextInt();
	
	int com = valorpc*car + 5*totalvendas/100;
	int saltotal = sal + com;
	
	System.out.println("O salário equivale a "+saltotal);
	
	}
}

