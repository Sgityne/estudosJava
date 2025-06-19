package maratonajava.javacore.aula22_exception.runtime.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        // Checked e Uncheck

        // NullPointerExpection
        Object object = null;
        System.out.println(object.toString());

        //ArrayIndexOutOfBoundsException
        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
