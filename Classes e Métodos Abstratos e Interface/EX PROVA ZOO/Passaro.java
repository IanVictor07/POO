public class Passaro extends Animal {
    private boolean voa ;
    private int envergadura ;

    public Passaro(String nome, float peso, boolean voa, int envergadura) {
        super(nome, peso, 1);
        this.voa = voa;
        this.envergadura = envergadura;
    }

    public float alturaDoVoo() {
        if (!voa)
            return 0.0f ;

        return (this.envergadura * 100) / this.peso ;
    }

    public boolean getVoa() {
        return this.voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public int getEnvergadura() {
        return this.envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }

    
}
