package decorator;

public class Computador implements Produto{
    public float preco;

    public Computador(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPrecoFinal() {
        return preco;
    }
}
