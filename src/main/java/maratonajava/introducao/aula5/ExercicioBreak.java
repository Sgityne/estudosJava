package maratonajava.introducao.aula5;

public class ExercicioBreak {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // CondiçãovalorParcela >= 1000

        double carValue = 40000;
        for (int parcela = 1; parcela <= carValue; parcela++) {
            double valorParcela = carValue / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Total de Parcelas: " + parcela + "\n| Valor de cada Parcela: " + valorParcela);
        }
    }
}
