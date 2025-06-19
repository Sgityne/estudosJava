package maratonajava.introducao.aula5;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println("while: " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("do while " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }


        // break
        // Imprima os primerios 25 numeros de um dado valor. Por Exemplo, 50
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            System.out.println(i);
            if (i == 25) {
                break;
            }
        }


        // continue
        double carValue = 40000;
        for (int parcela = (int) carValue; parcela >= 1; parcela--) {
            double valorParcela = carValue / parcela;
            if(valorParcela < 1000) {
                continue;
            }
            System.out.println("Total de Parcelas: " + parcela + "\n| Valor de cada Parcela: " + valorParcela);
        }
    }
}
