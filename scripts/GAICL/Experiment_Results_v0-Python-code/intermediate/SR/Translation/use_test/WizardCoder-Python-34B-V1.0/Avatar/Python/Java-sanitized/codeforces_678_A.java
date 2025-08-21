import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value_1, z;
        String[] input = scanner.nextLine().split(" ");
        value_1 = Integer.parseInt(input[0]);
        z = Integer.parseInt(input[1]);
        System.out.println((value_1 / z + 1) * z);
    }
}