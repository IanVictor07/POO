public class Funcionario extends Pessoa {
    protected int matricula ;
    protected Double salario ;

    public Funcionario(int matricula, Double salario, String nome, String funcao) {
        super(nome, funcao);
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public String getFuncao() {
        return "Funcionário" ;
    }

    public Double getSalario() {
        return salario - (salario * 0.08) ;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }    
    
}
