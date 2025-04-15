public class Carro {
	
	private Double combustivel;
	
	public Carro(Double combustivel){
		this.combustivel = combustivel;
		}
		
	public Carro(){
		this.combustivel = 0.0;
		}
	public Double autonomia(){
		return combustivel * 12;
		}
		
	public Double autonomia(String tipoCombustivel){
		
		if (tipoCombustivel == "Gasolina")
		{
			return combustivel * 12;
		}
		if (tipoCombustivel == "Etanol")
		{
			return combustivel * 8;
		}
		return 0.0;
		
	}
	
	public Double autonomia(String tipoCombustivel, Double abastecimento){
		if (tipoCombustivel == "Gasolina"){
			return combustivel * 12 + abastecimento;
		}
		if (tipoCombustivel == "Etanol"){
			return combustivel * 8 + abastecimento;
		}
		return 0.0;
	}
	
	public Double autonomia(String tipoCombustivel, Boolean carga){
		if (tipoCombustivel == "Gasolina" && carga == true) {
			return (combustivel * 12) * 0.7;
		} 
		if (tipoCombustivel == "Etanol" && carga == true) {
			return (combustivel) * 8 * 0.7;
		} 
		return 0.0;
	}
	
	public Double getCombustivel(){
		return combustivel;
		}
	public void setCombustivel(Double combustivel){
		this.combustivel = combustivel;
		}
	
}

