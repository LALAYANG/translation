import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] sorted_list = new int[count];
        for (int i = 0; i < count; i++) {
            sorted_list[i] = scanner.nextInt();
        }
        scanner.close();

        for (int value : sorted_list) {
            if ((value + 1) in sorted_list && (value + 2) in sorted_list) {
                System.out.println('YES');
                break;
            }
        } else {
            System.out.println('NO');
        }
    }
}