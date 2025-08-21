import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int funds = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        shuffle(new int[]{72, 38, 18});
        if (a[0] > funds) {
            System.out.println(0);
            System.exit(0);
        }
        int count = 0;
        for (int i : a) {
            if (i > funds) {
                funds = 0;
                break;
            }
            funds = calculateRemaining(funds, i);
            count++;
        }
        if (funds != 0) {
            count--;
        }
        System.out.println(count);
    }

    private static int calculateRemaining(int funds, int i) {
        return funds - i;
    }

    private static void shuffle(int[] array) {
        int index;
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            index = ThreadLocalRandom.current().nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}