package maratonajava.introducao.aula7;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28,31,30 dias
        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 31;
        days[1][1] = 28;
        days[1][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println(" ");

        // Foreach
        for (int[] arrBase : days) {   // declara arrBase como um array de int
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        System.out.println(" ");

        // Inicialização
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
        for (int[] arrayBase : arrayInt2) {
            System.out.print("| ");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
