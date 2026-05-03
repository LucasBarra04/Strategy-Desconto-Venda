package Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DescontoStrategyTest {

    @Test
    void descontoPercentualDeveCalcularCorretamente() {
        Venda venda = new Venda();
        venda.setValorBruto(300f);
        float resultado = venda.aplicarDesconto(new DescontoPercentual());
        assertEquals(255f, resultado, 0.01f);
    }

    @Test
    void descontoFixoDeveSubtrairValorCorreto() {
        Venda venda = new Venda();
        venda.setValorBruto(300f);
        float resultado = venda.aplicarDesconto(new DescontoFixo());
        assertEquals(250f, resultado, 0.01f);
    }

    @Test
    void descontoFixoMaiorQueValorDeveRetornarZero() {
        Venda venda = new Venda();
        venda.setValorBruto(30f);
        float resultado = venda.aplicarDesconto(new DescontoFixo());
        assertEquals(0f, resultado, 0.01f);
    }

    @Test
    void progressivoAbaixoDe100NaoDeveAplicarDesconto() {
        Venda venda = new Venda();
        venda.setValorBruto(80f);
        float resultado = venda.aplicarDesconto(new DescontoProgressivo());
        assertEquals(80f, resultado, 0.01f);
    }

    @Test
    void progressivoEntre100E199DeveAplicar5Porcento() {
        Venda venda = new Venda();
        venda.setValorBruto(100f);
        float resultado = venda.aplicarDesconto(new DescontoProgressivo());
        assertEquals(95f, resultado, 0.01f);
    }

    @Test
    void progressivoEntre200E499DeveAplicar10Porcento() {
        Venda venda = new Venda();
        venda.setValorBruto(300f);
        float resultado = venda.aplicarDesconto(new DescontoProgressivo());
        assertEquals(270f, resultado, 0.01f);
    }

    @Test
    void progressivoAcimaDe500DeveAplicar20Porcento() {
        Venda venda = new Venda();
        venda.setValorBruto(500f);
        float resultado = venda.aplicarDesconto(new DescontoProgressivo());
        assertEquals(400f, resultado, 0.01f);
    }

    @Test
    void caixaDeveAplicarDescontoPercentualSemLancarExcecao() {
        Caixa caixa = new Caixa();
        caixa.setValorBruto(300f);
        assertDoesNotThrow(caixa::aplicarDescontoPercentual);
    }

    @Test
    void caixaDeveAplicarDescontoFixoSemLancarExcecao() {
        Caixa caixa = new Caixa();
        caixa.setValorBruto(300f);
        assertDoesNotThrow(caixa::aplicarDescontoFixo);
    }

    @Test
    void caixaDeveAplicarDescontoProgressivoSemLancarExcecao() {
        Caixa caixa = new Caixa();
        caixa.setValorBruto(300f);
        assertDoesNotThrow(caixa::aplicarDescontoProgressivo);
    }
}