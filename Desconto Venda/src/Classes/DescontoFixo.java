package Classes;

public class DescontoFixo implements EstrategiaDesconto {
    @Override
    public float calcular(float valorBruto) {
        float resultado = valorBruto - 50f;
        return resultado < 0 ? 0 : resultado;
    }
}