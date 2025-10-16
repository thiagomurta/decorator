package decorator;

public abstract class ProdutoDecorator implements Produto{

    private Produto produto;

    public ProdutoDecorator(Produto produto){
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public abstract float getPercentualDesconto();
    public abstract float getPercentualAumento();

    public float getPrecoFinal() {
        return this.produto.getPrecoFinal() * (1 + ((getPercentualAumento() - getPercentualDesconto()) / 100));
    }

}
