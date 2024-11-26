import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        HashMap<String, Funcionario> funcionariosMap = new HashMap<>();

        Funcionario func1 = new Funcionario("João", 3000.0, "TI");
        Funcionario func2 = new Funcionario("Maria", 3500.0, "RH");
        Funcionario func3 = new Funcionario("Pedro", 4000.0, "Financeiro");
        Funcionario func4 = new Funcionario("Ana", 4500.0, "Marketing");

        funcionariosMap.put(func1.getNome(), func1);
        funcionariosMap.put(func2.getNome(), func2);
        funcionariosMap.put(func3.getNome(), func3);
        funcionariosMap.put(func4.getNome(), func4);

        for (String nome : funcionariosMap.keySet()) {
            Funcionario funcionario = funcionariosMap.get(nome);
            System.out.println(funcionario);
        }

    }
}
