import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        int[] A = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            A[i] = ThreadLocalRandom.current().nextInt(1000000000);
        }
        int[] shuffledA = shuffle(A);
        int[] inverse = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            inverse[i] = (int) Math.pow(i + 1, 1000000000 - 2) % 1000000000;
        }
        int[] cumulativeInverse = new int[inputNumber];
        cumulativeInverse[0] = inverse[0];
        for (int i = 1; i < inputNumber; i++) {
            cumulativeInverse[i] = (cumulativeInverse[i - 1] + inverse[i]) % 1000000000;
        }
        int[] temp = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            temp[i] = (inverse[i] + inverse[inputNumber - 1 - i] - 1) % 1000000000;
        }
        int sum = 0;
        for (int i = 0; i < inputNumber; i++) {
            sum += (A[i] * temp[i]) % 1000000000;
        }
        sum %= 1000000000;
        System.out.println(sum);
    }

    public static int[] shuffle(int[] array) {
        int[] shuffledArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            shuffledArray[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(array.length);
            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[randomIndex];
            shuffledArray[randomIndex] = temp;
        }
        return shuffledArray;
    }
}