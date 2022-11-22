import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 & array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }
}
