import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sa = scanner.nextLine().split(" ");
        int a = Integer.parseInt(sa[0]);
        int b = (int) (Float.parseFloat(sa[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}