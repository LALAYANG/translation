import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int flag = 0;
        String[] d1 = new String[n];
        String[] d2 = new String[n];
        String rem = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1[i] = s[i].charAt(j) + "";
                }
                if (i == n - j - 1) {
                    d2[i] = s[i].charAt(j) + "";
                }
                if (i != j && i != n - j - 1) {
                    rem += s[i].charAt(j);
                }
            }
        }
        if (rem.length() != 1) {
            System.out.println("NO");
        } else if (!(d1[0].equals(d2[0]))) {
            System.out.println("NO");
        } else if (d1[0].length() != 1) {
            System.out.println("NO");
        } else if (d1[0].equals(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}