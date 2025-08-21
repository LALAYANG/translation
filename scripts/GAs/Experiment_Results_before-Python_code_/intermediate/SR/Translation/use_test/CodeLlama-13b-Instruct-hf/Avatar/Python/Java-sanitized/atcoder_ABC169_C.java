import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sa = sc.nextLine();
        String sb = sc.nextLine();
        int a = Integer.parseInt(sa);
        int b = (int) (Double.parseDouble(sb) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}