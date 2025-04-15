
public class Veiculo{
	private String placa;
	private String modelo;
	private String tipo;
	private int quilometragem;
	
	public String getPlaca(){
		return placa;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public int getQuilometragem(){
		return quilometragem;
	}
	
	public void setQuilometragem(int quilometragem){
		this.quilometragem = quilometragem;
	}
	
	public Veiculo(String placa, String modelo, String tipo){
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.quilometragem = 0;
	}
	
	public Veiculo(String placa, String modelo, String tipo, int quilometragem){
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.quilometragem = quilometragem;
	}
	
	public Double calcularLocacao(int dias){
		Double valor;
		switch (tipo){
			case "ECONOMICO":
				valor = (dias*100) + (dias*100*0.1);
				break;
			case "SUV":
				valor = (dias*150) + (dias*100*0.1);
				break;
			case "LUXO":
				valor = (dias*250) + (dias*100*0.1);
				break;
			default:
				return 0.0;
		}
		quilometragem+=(dias*100);
		return valor;
	}
	
	public Double calcularLocacao(int dias, int kmRodados){
		Double valor;
		switch (tipo){
			case "ECONOMICO":
				valor = (dias*100) + (kmRodados*0.1);
				break;
			case "SUV":
				valor = (dias*150) + (kmRodados*0.1);
				break;
			case "LUXO":
				valor = (dias*250) + (kmRodados*0.1);
				break;
			default:
				return 0.0;
		}
		quilometragem+=kmRodados;
		return valor;
	}
	
	public Double calcularLocacao(int dias, int kmRodados, boolean seguro){
		Double valor;
		switch (tipo){
			case "ECONOMICO":
				if (seguro==true)
					valor = (dias*150) + (kmRodados*0.1);
				else
					valor = (dias*100) + (kmRodados*0.1);
				break;
			case "SUV":
				if (seguro==true)
					valor = (dias*200) + (kmRodados*0.1);
				else
					valor = (dias*150) + (kmRodados*0.1);
				break;
			case "LUXO":
				if (seguro==true)
					valor = (dias*300) + (kmRodados*0.1);
				else
					valor = (dias*250) + (kmRodados*0.1);
				break;
			default:
				return 0.0;
		}
		quilometragem+=kmRodados;
		return valor;
	}
	
	public String exibirDetalhes(){
		int valor;
		switch (tipo){
			case "ECONOMICO":
				valor = 100;
				break;
			case "SUV":
				valor = 150;
				break;
			case "LUXO":
				valor = 250;
				break;
			default:
				valor = 0;
		}
		return modelo + " - Placa: " + placa  + " - " + tipo + " - Quilometragem: " + quilometragem + " - Valor Diário: " + valor;
	}
	
	
	
}

