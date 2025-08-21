import java.util.Scanner;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            if (v == 0 && t == 0) {
                break;
            }
            System.out.println(v * t * 2);
        }
    }
}