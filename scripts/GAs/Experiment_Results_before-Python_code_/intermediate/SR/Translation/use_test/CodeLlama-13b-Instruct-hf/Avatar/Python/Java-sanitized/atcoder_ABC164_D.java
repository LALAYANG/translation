import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int l = 2019;
        int[] m = new int[l];
        m[0] = 1;
        int a = 0;
        int r = 0;
        for (int i = 0; i < input.length(); i++) {
            a += Integer.parseInt(input.substring(i, i + 1)) * (int) Math.pow(10, i, l);
            r += m[a % l];
            m[a % l] += 1;
        }
        System.out.println(r);
    }
}