public class Lanchonete {
	
	public static void main (String[] args) {
		
		Pedido cliente1 = new Pedido(1);
		Pedido cliente2 = new Pedido(2, "Reginaldo");
		
		System.out.println("Produto simples: "+cliente1.adiciona(2));
		System.out.println("Produto simples: "+cliente2.adiciona(3));
		
		System.out.println("Produto simples e batata:"+cliente1.adiciona(2, 500.0, 200.0));
		System.out.println("Produto simples e batata:"+cliente2.adiciona(3,100.00));
		
		System.out.println("Produto simples + batata e refrigerante: "+cliente1.adiciona(2, 500.0,200.0));
		System.out.println("Produto simples + batata e refrigerante: "+cliente2.adiciona(3, 100.0, 400.0));
		
		System.out.println("Produto simples + batata e cookie: "+cliente1.adiciona(2, 500.0, 3));
		System.out.println("Produto simples + batata e cookie: "+cliente2.adiciona(3, 100.0, 2));
		
		
	}
}

