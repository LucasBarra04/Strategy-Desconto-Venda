package Classes;

public class DescontoProgressivo implements EstrategiaDesconto {
    @Override
    public float calcular(float valorBruto) {
        if (valorBruto >= 500)      return valorBruto - (valorBruto * 20 / 100);
        else if (valorBruto >= 200) return valorBruto - (valorBruto * 10 / 100);
        else if (valorBruto >= 100) return valorBruto - (valorBruto * 5  / 100);
        return valorBruto;
    }
}