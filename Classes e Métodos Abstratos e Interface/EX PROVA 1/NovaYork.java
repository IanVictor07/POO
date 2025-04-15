public class NovaYork extends PacoteViagem implements Internacional{
    private String tipo;

    public NovaYork(String tipo, int hotel, int duracao, Double diaria) {
        super(hotel, duracao, diaria);
        this.tipo = tipo;
    }
    
    @Override
    public Double calculaPreco() {
        Double valorPacote = this.diaria * this.duracao;

        valorPacote += valorPacote * (0.1 * this.hotel);

        if (this.tipo.equals("COMPLETO")) {
            valorPacote += this.diaria;
        }

        return valorPacote;
    }

    @Override
    public Double cambio(Double valorDia) {
        return this.calculaPreco() / valorDia;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
