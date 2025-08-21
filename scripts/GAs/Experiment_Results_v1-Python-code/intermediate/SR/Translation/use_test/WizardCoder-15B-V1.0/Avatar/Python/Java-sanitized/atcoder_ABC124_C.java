import java.util.*;
import java.util.stream.*;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        String input = "10010010";
        int[] arr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}