public class Vendedor extends Funcionario implements Comissao {
    private Double totalDeVendas ;

    public Vendedor(Double totalDeVendas, int matricula, Double salario, String nome, String funcao) {
        super(matricula, salario, nome, funcao);
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public Double calculaComissao() {
        return totalDeVendas * 0.025 ;
    }

    @Override
    public Double getSalario() {
        Double bruto = salario + calculaComissao();
        return bruto - (bruto * 0.08);
    }

    @Override
    public String getFuncao() {
        return "Vendedor" ;
    }

    public Double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(Double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    
}
