import java.lang.System;

public class Question1 {
    public static void main(String[] args) {
        double[] arrayNotas = {7.5, 8.0, 6.0, 9.5, 7.0, 8.5, 5.5, 6.5, 7.8, 9.0};

        double somaMedia = 0.0;

        for (double nota : arrayNotas) {
            somaMedia += nota;
        }
        double media = somaMedia / arrayNotas.length;

        System.out.println("Media: " + media);

        System.out.println("Notas maiores que a média:");
        for (double nota : arrayNotas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }

    }
}
