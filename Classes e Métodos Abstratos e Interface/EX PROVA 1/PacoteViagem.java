public abstract class PacoteViagem {
    
    protected int hotel;
    protected int duracao;
    protected Double diaria;

    public PacoteViagem(int hotel, int duracao, Double diaria) {
        this.hotel = hotel;
        this.duracao = duracao;
        this.diaria = diaria;
    }
    
    public abstract Double calculaPreco();

    public int getHotel() {
        return hotel;
    }
    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Double getDiaria() {
        return diaria;
    }
    public void setDiaria(Double diaria) {
        this.diaria = diaria;
    }
}
