import java.util.Scanner;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threshold_s = scanner.nextInt();
        int threshold_w = scanner.nextInt();

        if (threshold_s <= threshold_w) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}