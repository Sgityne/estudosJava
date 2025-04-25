package maratonajava.introducao.aula5;

public class ExercicioFor {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        for (int i = 0; i < 1000000; i+= 2) {
            System.out.println(i);
        }

        // Caso futuramente, os requisitos mudarem, o código acima pode quebrar Ex: i = 1
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
