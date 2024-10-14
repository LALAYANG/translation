import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.nextLine().split(" ");
        boolean possible = true;
        for (String i : m) {
            if (m.count(i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}