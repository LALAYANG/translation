import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        for (int test_case = 1; test_case <= tcs; test_case++) {
            int a = sc.nextInt();
            System.out.println(a == 0 ? 1 : 0);
        }
    }
}