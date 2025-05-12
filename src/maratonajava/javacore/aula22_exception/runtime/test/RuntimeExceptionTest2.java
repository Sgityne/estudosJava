package maratonajava.javacore.aula22_exception.runtime.test;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        System.out.println(divide(1, 0));
    }

    /**
     *
     * @param a
     * @param b Can't be zero
     * @return
     * @throws IllegalArgumentException If b equals zero
     */
    private static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
