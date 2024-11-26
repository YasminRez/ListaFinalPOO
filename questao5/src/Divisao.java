public class Divisao {
    public double calcula(double numerador, double denominador) {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }
}
