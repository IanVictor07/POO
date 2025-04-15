public class PortoSeguro extends PacoteViagem implements Nacional{
    private int praias;
    
    public PortoSeguro(int praias, int hotel, int duracao, Double diaria) {
        super(hotel, duracao, diaria);
        this.praias = praias;
    }

    @Override
    public Double calculaPreco() {
        Double valorPacote = this.diaria * this.duracao;
        valorPacote += valorPacote * (0.05 * this.hotel);
        valorPacote += valorPacote * (0.15 * this.praias);
        return valorPacote;
    }

    @Override
    public Double adicional(String tipo) {

        if (tipo.equals("AEREO")) {
            return this.diaria * 0.8;
        }

        if (tipo.equals("TERRESTRE")) {
            return 0.0;
        }

        return 0.0;
    }

    public int getPraias() {
        return praias;
    }
    public void setPraias(int praias) {
        this.praias = praias;
    }
}
