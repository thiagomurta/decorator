package decorator;

public class Imposto extends ProdutoDecorator{

    public Imposto(Produto produto){
        super(produto);
    }

    @Override
    public float getPercentualDesconto() {
        return 0.0f;
    }

    @Override
    public float getPercentualAumento() {
        return 5.0f;
    }

}
