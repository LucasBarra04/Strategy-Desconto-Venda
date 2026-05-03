package Classes;

public class Caixa {
    private float valorBruto;

    public float getValorBruto()               { return valorBruto; }
    public void setValorBruto(float valorBruto) { this.valorBruto = valorBruto; }

    public void aplicarDescontoPercentual() {
        Venda venda = new Venda();
        venda.setValorBruto(valorBruto);
        float resultado = venda.aplicarDesconto(new DescontoPercentual());
        System.out.println("Desconto percentual (15%): R$" + resultado);
    }

    public void aplicarDescontoFixo() {
        Venda venda = new Venda();
        venda.setValorBruto(valorBruto);
        float resultado = venda.aplicarDesconto(new DescontoFixo());
        System.out.println("Desconto fixo (R$50): R$" + resultado);
    }

    public void aplicarDescontoProgressivo() {
        Venda venda = new Venda();
        venda.setValorBruto(valorBruto);
        float resultado = venda.aplicarDesconto(new DescontoProgressivo());
        System.out.println("Desconto progressivo: R$" + resultado);
    }
}