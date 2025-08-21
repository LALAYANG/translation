import java.util.*;
import java.io.*;
import java.math.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(l[n / 2]);
    }
}