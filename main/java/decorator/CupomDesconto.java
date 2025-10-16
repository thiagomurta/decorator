package decorator;

public class CupomDesconto extends ProdutoDecorator{

    public CupomDesconto(Produto produto){
        super(produto);
    }

    @Override
    public float getPercentualDesconto() {
        return 10.0f;
    }

    @Override
    public float getPercentualAumento() {
        return 0.0f;
    }
}
