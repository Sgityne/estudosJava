package maratonajava.introducao.aula2;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Giovani";
        String address = "Avenida Paulista";
        double salary = 1900.50;
        String dateReceived = "18 de novembro de 2017";

        System.out.println(
                "Eu "+ name + ", morando no endereço " + address + ",\n" +
                "confirmo que recebi o salário de " + salary + ", na data " + dateReceived);
    }
}
