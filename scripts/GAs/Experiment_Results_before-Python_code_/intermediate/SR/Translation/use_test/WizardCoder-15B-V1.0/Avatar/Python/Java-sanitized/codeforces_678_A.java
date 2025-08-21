import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vamshi, z;
        vamshi = sc.nextInt();
        z = sc.nextInt();
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}