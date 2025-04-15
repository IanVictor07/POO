public class ContaAPagar {

    private int codigo;
    private String descricao;
    private int diaDeVencimento;
    private float valor;
    private boolean status = false;

    public ContaAPagar(int codigo, int diaDeVencimento, float valor) {
        this.codigo = codigo;
        this.diaDeVencimento = diaDeVencimento;
        this.valor = valor;
        this.descricao = "SEM DESCRIÇÃO";
    }

    public ContaAPagar(int codigo, String descricao, int diaDeVencimento, float valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.diaDeVencimento = diaDeVencimento;
        this.valor = valor;
    }

    public String pagar(int dia) {
        if (status) {
            return "Conta já paga.";
        }

        if (dia > diaDeVencimento) {
            valor += valor * 0.10f; 
        }

        status = true;
        return "Pagamento realizado. Valor final: R$ " + valor;
    }

    public String pagar(int dia, float desconto) {
        if (status) {
            return "Conta já paga.";
        }

        if (dia > diaDeVencimento) {
            valor += valor * 0.10f; 
        } else {
            valor -= desconto; 
        }

        status = true;
        return "Pagamento realizado. Valor final: R$ " + valor;
    }

    public String exibir() {
        return "Código: " + codigo +
               "\nDescrição: " + descricao +
               "\nDia de vencimento: " + diaDeVencimento +
               "\nValor: R$ " + valor +
               "\nStatus: " + (status ? "Paga" : "Não paga");
    }
    
    public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDiaDeVencimento(int diaDeVencimento){
		this.diaDeVencimento = diaDeVencimento;
	}
	
	public int getDiaDeVencimento(){
		return diaDeVencimento;
	}
	
	public void setValor(float valor){
		this.valor = valor;
	}
	
	public float getValor(){
		return valor;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public boolean isStatus(){
		return status;
	}
	
	
}


