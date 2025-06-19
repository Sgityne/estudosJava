package maratonajava.introducao.aula6;

public class Arrays {
    public static void main(String[] args) {
        int [] ages = new int[3];
        ages[0] = 21;
        ages[1] = 15;
        ages[2] = 11;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        // Valores Padrões
        //byte, short, int, long, float e double => 0
        // char '/u0000' ' '
        // boolean false
        // String null
        String [] names = new String[3];
        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        int [] numbers = {1, 2, 3, 4, 5};
        int [] numbers2 = new int[]{1, 2, 3, 4, 5};

        /*
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        */
        // foreach
        for (int i:numbers2) {
            System.out.println(i);
        }


    }
}
