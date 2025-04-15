import java.util.*;

public class Teste {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Fatura fatura = new Fatura(1, "Pomba de borracha", 3, 50.0);
		
		System.out.println("Numero "+fatura.getNumero()+" Descrição "+fatura.getDescricao()+" Quantidade "+fatura.getQuantidade()+" Preço "+fatura.getPreco());
		
		System.out.println("O VALOR DA FATURA SERÁ DE "+fatura.getValorDaFatura());
	}
}

