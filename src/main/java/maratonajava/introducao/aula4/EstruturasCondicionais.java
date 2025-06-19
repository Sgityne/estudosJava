package maratonajava.introducao.aula4;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // If
        int age1 = 20;
        boolean isAuthorizedToBuyDrink = age1 >= 18;

        if (isAuthorizedToBuyDrink) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if (isAuthorizedToBuyDrink == false) { // Mesma coisa que !isAuthorizedtoBuyDrink
            System.out.println("Não autorizado a comprar bebida alcólica");
        }


        // Else if
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= categoria adulto
        int age2 = 17;
        String categoria;

        if (age2 < 15) {
            categoria = "Categoria Infantil";
        } else if (age2 >= 15 && age2 < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);


        // Operador ternário
        // Doar se salário > 5k
        double salary = 6000;
        String messageDonate = "Eu vou doar 500 por DevDojo";
        String messageDontDonate = "Ainda não tenoh condições";
        // (condição) ? verdadeiro : falso
        String resultado = salary > 5000 ? messageDonate : messageDontDonate;
        System.out.println(resultado);


        // Switch
        // Imprima o dia da semana, considerando 1 como domingo
        byte day = 5;
        //Dentro do Switch. colocamos: char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char gender = 'M';
        switch (gender){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
