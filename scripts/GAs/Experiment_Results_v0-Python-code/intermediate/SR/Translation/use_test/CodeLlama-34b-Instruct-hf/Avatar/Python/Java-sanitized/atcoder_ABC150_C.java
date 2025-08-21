import java.util.Scanner;
import java.util.Date;
import java.util.Base64;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = calculateSum(n, 1);
        System.out.println(sum);
    }

    public static int calculateSum(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}