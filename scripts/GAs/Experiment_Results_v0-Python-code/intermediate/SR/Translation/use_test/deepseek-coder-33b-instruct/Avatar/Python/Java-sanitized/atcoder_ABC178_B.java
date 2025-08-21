import java.util.*;
import java.lang.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = {a * multiplier, b * d, a * d, b * multiplier};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}