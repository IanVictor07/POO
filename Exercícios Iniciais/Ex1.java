import java.util.Scanner;
public class Ex1{
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Base");
	int base = scan.nextInt();
	System.out.println("Altura");
	int alt = scan.nextInt();
	int x = base*alt;
	System.out.println("A área do retângulo equivale a: "+ x);
	}
}
