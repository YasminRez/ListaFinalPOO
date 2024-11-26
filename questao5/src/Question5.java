public class Question5 {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();

        // valores válidos
        try {
            double resultado = divisao.calcula(10, 2);
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // divisão por zero
        try {
            double resultado = divisao.calcula(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
