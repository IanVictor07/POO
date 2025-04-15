public class CaldasNovas extends PacoteViagem implements Nacional{
    private boolean parque;

    public CaldasNovas(boolean parque, int hotel, int duracao, Double diaria) {
        super(hotel, duracao, diaria);
        this.parque = parque;
    }
    
    @Override
    public Double calculaPreco() {
        Double valorPacote = this.diaria * this.duracao;

        valorPacote += valorPacote * (0.1 * this.hotel);

        if (parque) {
            valorPacote += 200.0;
        }

        return valorPacote;
    }

    @Override
    public Double adicional(String tipo) {

        if (tipo.equals("INDIVIDUAL")) {
            return this.diaria * 0.5;
        }

        if (tipo.equals("COLETIVO")) {
            return -1 * this.diaria * 0.1;
        }
        
        return 0.0;
    }

    public boolean isParque() {
        return parque;
    }
    public void setParque(boolean parque) {
        this.parque = parque;
    }
}
