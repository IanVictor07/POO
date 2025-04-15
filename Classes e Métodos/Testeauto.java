public class Testeauto {
	
    public static void main(String[] args) {
        Carro carro1 = new Carro(10.0);

        System.out.println("Carro 1:");
        System.out.println("Autonomia padrão (Gasolina): " + carro1.autonomia());
        System.out.println("Autonomia com Gasolina: " + carro1.autonomia("Gasolina"));
        System.out.println("Autonomia com Etanol: " + carro1.autonomia("Etanol"));
        System.out.println("Autonomia com Gasolina e carga: " + carro1.autonomia("Gasolina", true));
        System.out.println("Autonomia com Etanol e carga: " + carro1.autonomia("Etanol", true));
        System.out.println("Autonomia com Gasolina e abastecimento: " + carro1.autonomia("Gasolina", 5.0));
        System.out.println("Autonomia com Etanol e abastecimento: " + carro1.autonomia("Etanol", 5.0));
        
        Carro carro2 = new Carro();

        System.out.println("\nCarro 2:");
        System.out.println("Autonomia padrão (Gasolina): " + carro2.autonomia());
        System.out.println("Autonomia com Gasolina: " + carro2.autonomia("Gasolina"));
        System.out.println("Autonomia com Etanol: " + carro2.autonomia("Etanol"));
        System.out.println("Autonomia com Gasolina e carga: " + carro2.autonomia("Gasolina", true));
        System.out.println("Autonomia com Etanol e carga: " + carro2.autonomia("Etanol", true));
        System.out.println("Autonomia com Gasolina e abastecimento: " + carro2.autonomia("Gasolina", 10.0));
        System.out.println("Autonomia com Etanol e abastecimento: " + carro2.autonomia("Etanol", 10.0));
		
		/*
		Carro p1 = new Carro();
		Carro p2 = new Carro(14.0);
		Carro p3 = new Carro(14.0);
		Carro p4 = new Carro(14.0);
		
		System.out.println("autonomia p1: " +p1.autonomia());
		System.out.println("autonomia p2: " +p2.autonomia("etanol"));
		System.out.println("autonomia p3: " +p3.autonomia("gasolina", 40.0));
		System.out.println("autonomia p4: " +p4.autonomia("gasolina", true));
		*/
    }
}



