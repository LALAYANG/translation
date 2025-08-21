import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int z = sc.nextInt();
        int result = (value1 / z + 1) * z;
        System.out.println(result);
    }
}