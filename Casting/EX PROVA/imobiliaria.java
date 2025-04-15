public class imobiliaria {
	
	private imovel[] imoveis = new imovel[10];
	
	public imovel[] getImoveis(){
		return imoveis;
	}
	
	public boolean adicionaImovel(residencial residencia){
		for(int i = 0; i<imoveis.length ; i++){
			if (imoveis[i] == null){
				imoveis[i] = residencia;
				return true;
			}
		}
		return false;
	}
	public boolean adicionaImovel(comercial comercio){
		for (int i = 0; i<imoveis.length ; i++){
			if (imoveis[i] == null){
				imoveis[i] = comercio;
				return true;
			}
		}
		return false;	
	}	
	public boolean excluiImovel(String descricao){
		for(int i=0; i<imoveis.length; i++){
			if(imoveis[i] != null){
				if(imoveis[i].getDescricao().equalsIgnoreCase(descricao)){
					imoveis[i] = null;
					return true;
				}
			}
		}
		return false;		
	}
	
	public imovel[] disponiveis(){
		return imoveis;
	}
	
	//public residencial[] residenciais(){}
	//public comercial[] comerciais(){}
	
	public imovel buscaImovel(String descricao){
		for(int i=0; i<imoveis.length; i++){
			if(imoveis[i] != null){
				if(imoveis[i].getDescricao().equalsIgnoreCase(descricao)){
					return imoveis[i];
				}
			}	
		}
		return null;
	}
}
