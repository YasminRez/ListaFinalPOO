import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(30000);

        for (int i = 1; i <= 30000; i++) {
            numeros.add(i);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
