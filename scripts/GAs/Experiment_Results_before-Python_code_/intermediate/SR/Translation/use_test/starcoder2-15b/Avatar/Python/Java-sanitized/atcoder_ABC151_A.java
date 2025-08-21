import java.util.Scanner;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == c.charAt(0)) {
                i = j;
                break;
            }
        }
        System.out.println(a[i + 1]);
    }
}