public class Cachorro extends Mamifero {
    private float altura ;

    public Cachorro(String nome, float peso, int idade, int velocidade, float altura) {
        super(idade, velocidade, peso, nome, 2);
        this.altura = altura;
    }

    @Override
    public float correr() {
        if (peso <= 4)
            return velocidade * (peso / altura);
        else
            return velocidade * (peso / (altura + 20));
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
