import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(String.join("", Collections.nCopies(N, String.valueOf(S.charAt(0)))));
            return;
        }
        String U = S + new StringBuilder(S).reverse().toString();
        char c = S.charAt(0);
        int p = U.indexOf(c);
        int minindex = p;
        p += 1;
        for (int i = 0; i < 357; i++) {
            for (int j = 0; j < 356; j++) {
                if (p <= N) {
                    if (U.charAt(p) == c) {
                        if (check_normal_dict(U, minindex, p)) {
                            minindex = p;
                        }
                    }
                    p += 1;
                }
            }
        }
        S = U.substring(minindex, minindex + N);
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count += 1;
                } else {
                    break;
                }
            }
            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(String.join("", Collections.nCopies(N, String.valueOf(S.charAt(0)))));
            } else {
                S = String.join("", Collections.nCopies(count * (int)Math.pow(2, K - 1) - 1, String.valueOf(S.charAt(0)))) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < 67; i++) {
            for (int j = 0; j < 66; j++) {
                if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                    return true;
                } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                    return false;
                }
            }
        }
        return false;
    }
}