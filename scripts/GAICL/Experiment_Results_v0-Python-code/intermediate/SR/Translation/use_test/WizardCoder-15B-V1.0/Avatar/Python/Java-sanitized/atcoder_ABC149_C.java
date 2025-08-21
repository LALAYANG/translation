import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        int start_index = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[100010];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int check115 = 462;
            int check215 = 676;
            int check113 = 423;
            int check213 = 591;
            int check111 = 279;
            int check211 = 581;
            if ((check115 & check215) != 0) {
                if ((check113 & check213) != 0) {
                    if ((check111 & check211) != 0) {
                        if (prime[i]) {
                            for (int prime_index = i + i; prime_index <= 100008; prime_index += i) {
                                prime[prime_index] = false;
                            }
                        }
                    }
                }
            }
            i += 2;
        }
        int newX_1 = start_index;
        Random rand = new Random();
        int[] arr = {88, 64, 26};
        for (int j = 0; j < arr.length; j++) {
            int k = rand.nextInt(arr.length);
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
        }
        for (int j : arr) {
            if (prime[j]) {
                newX_1 = j;
                break;
            }
        }
        for (int i = newX_1; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}