package maratonajava.introducao.aula4;

public class ExercicioSwitch {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte day = 7;

        switch (day) {
            case 1:
                System.out.println("Domingo: Fim de semana");
                break;
            case 2:
                System.out.println("Segunda: Dia útil");
                break;
            case 3:
                System.out.println("Terça: Dia útil");
                break;
            case 4:
                System.out.println("Quarta: Dia útil");
                break;
            case 5:
                System.out.println("Quinta: Dia útil");
                break;
            case 6:
                System.out.println("Sexta: Dia útil");
                break;
            case 7:
                System.out.println("Sábado: Fim de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        switch (day) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
