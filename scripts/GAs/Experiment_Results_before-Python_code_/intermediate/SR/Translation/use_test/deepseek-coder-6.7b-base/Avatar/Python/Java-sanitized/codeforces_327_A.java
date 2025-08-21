import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - '0';
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int j = i;
                while (j < n && arr[j] == 0) {
                    j++;
                }
                if (j == n) {
                    ans = Math.max(ans, n - i);
                } else {
                    ans = Math.max(ans, j - i);
                }
                i = j;
            }
        }
        System.out.println(ans);
    }
}