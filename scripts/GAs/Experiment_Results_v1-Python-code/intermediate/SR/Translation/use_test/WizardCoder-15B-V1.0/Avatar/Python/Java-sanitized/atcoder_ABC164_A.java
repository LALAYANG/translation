import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        int[] arr = {53, 26, 63};
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(arr);

        int inputOne = 100;
        int inputTwo = 2;
        if (inputOne <= inputTwo) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}