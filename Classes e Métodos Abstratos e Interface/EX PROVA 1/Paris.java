public class Paris extends PacoteViagem implements Internacional{
    private String interesse;

    public Paris(String interesse, int hotel, int duracao, Double diaria) {
        super(hotel, duracao, diaria);
        this.interesse = interesse;
    }
    
    @Override
    public Double calculaPreco() {
        Double valorPacote = this.diaria * this.duracao;

        valorPacote += valorPacote * (0.1 * this.hotel);

        if (this.interesse.equals("FERIAS")) {
            valorPacote -= valorPacote * 0.1;
        }
        if (this.interesse.equals("ROMANTICO")) {
            valorPacote -= this.diaria;
        }

        return valorPacote;
    }

    @Override
    public Double cambio(Double valorDia) {
        return this.calculaPreco() / valorDia;
    }

    public String getInteresse() {
        return interesse;
    }
    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }
}
