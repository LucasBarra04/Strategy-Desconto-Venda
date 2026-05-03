package Classes;

public class Venda {
    private float valorBruto;

    public float getValorBruto()              { return valorBruto; }
    public void setValorBruto(float valorBruto) { this.valorBruto = valorBruto; }

    public float aplicarDesconto(EstrategiaDesconto estrategia) {
        return estrategia.calcular(valorBruto);
    }
}