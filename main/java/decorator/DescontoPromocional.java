package decorator;

public class DescontoPromocional extends ProdutoDecorator{

    public DescontoPromocional(Produto produto){
        super(produto);
    }

    @Override
    public float getPercentualDesconto() {
        return 15.0f;
    }

    @Override
    public float getPercentualAumento() {
        return 0.0f;
    }
}
