package maratonajava.introducao.aula2;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        /* Casting: Forçar um valor de um variável dentro da outra
            long numeroGrande = (long) 155.23;
                imprimir só 155 porque o long não suporta números decimais

                Tipo primitivo = tipos que vão guardar em memória um valor simples
                String não é um tipo primitivo. String no Java é um objeto do tipo String
        */
        int age = 10;
        long longNumber = 100000L;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean t = true;
        boolean f = false;
        char asciiA = 65;
        char unicodeA = '\u0041';
        String name = "asdfghjkl";

        System.out.println("A idade é "+age+" anos");
        System.out.println(asciiA);
        System.out.println(unicodeA);
    }
}
