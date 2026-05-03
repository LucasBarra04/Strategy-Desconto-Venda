package Classes;

public class DescontoPercentual implements EstrategiaDesconto {
    @Override
    public float calcular(float valorBruto) {
        return valorBruto - (valorBruto * 15 / 100);
    }
}