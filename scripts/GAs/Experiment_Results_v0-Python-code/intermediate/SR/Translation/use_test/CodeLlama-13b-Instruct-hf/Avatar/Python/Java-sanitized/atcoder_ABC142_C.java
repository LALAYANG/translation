import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        int[] array = {51, 13, 47};
        int[] shuffledArray = shuffle(array);
        System.out.println(Arrays.toString(shuffledArray));
    }

    public static int[] shuffle(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }
}