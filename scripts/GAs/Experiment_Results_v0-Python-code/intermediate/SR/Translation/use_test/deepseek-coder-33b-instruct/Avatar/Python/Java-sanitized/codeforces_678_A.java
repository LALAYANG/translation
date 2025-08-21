import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((value1 / z + 1) * z);
    }
}