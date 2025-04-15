import java.util.Scanner;
public class Ex3 {
	
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Informe o custo de fábrica do carro ");
	float custo = scan.nextInt();
	float imposto = 45*custo/100;
	System.out.println("VALOR IMPOSTO = "+imposto);
	float dist = 28*custo/100;
	System.out.println("VALOR DA DISTRIBUIDORA = "+dist);
	float total = custo  + imposto + dist;
	System.out.print("O custo final do carro será de "+total);
	}
}

