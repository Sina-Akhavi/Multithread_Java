public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 4}; 
        change(array);

        System.out.println(array[0]);
    }

    private static void change(int[] array) {
        array[0] = 0;
    }
}
