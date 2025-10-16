package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarPrecoProduto(){
        Produto produto = new Computador(4000.0f);

        assertEquals(4000.0f, produto.getPrecoFinal(), 0.01);
    }

    @Test
    void deveRetornarPrecoProdutoComDescontoPromocional(){
        Produto produto = new DescontoPromocional(new Computador(4000.0f));

        assertEquals(3400.0f, produto.getPrecoFinal(), 0.01);
    }

    @Test
    void deveRetornarPrecoProdutoComImposto(){
        Produto produto = new Imposto(new Computador(4000.0f));

        assertEquals(4200.0f, produto.getPrecoFinal(), 0.01);
    }

    @Test
    void deveRetornarPrecoProdutoComCupomDesconto(){
        Produto produto = new CupomDesconto(new Computador(4000.0f));

        assertEquals(3600.0f, produto.getPrecoFinal(), 0.01);
    }

    @Test
    void deveRetornarPrecoProdutoComDescontoPromocionalMaisCupomDesconto(){
        Produto produto = new CupomDesconto(new DescontoPromocional(new Computador(4000.0f)));

        assertEquals(3060.0f, produto.getPrecoFinal(), 0.01);
    }

    @Test
    void deveRetornarPrecoProdutoComDescontoPromocionalMaisImposto(){
        Produto produto = new Imposto(new DescontoPromocional(new Computador(4000.0f)));

        assertEquals(3570.0f, produto.getPrecoFinal(), 0.01);
    }

    @Test
    void deveRetornarPrecoProdutoComCupomDescontoMaisImposto(){
        Produto produto = new Imposto(new CupomDesconto(new Computador(4000.0f)));

        assertEquals(3780.0f, produto.getPrecoFinal(), 0.01);
    }

    @Test
    void deveRetornarPrecoProdutoComDescontoPromocionalMaisImpostoMaisCupomDesconto(){
        Produto produto = new Imposto(new CupomDesconto(new DescontoPromocional(new Computador(4000.0f))));

        assertEquals(3213.0f, produto.getPrecoFinal(), 0.01f);
    }
}