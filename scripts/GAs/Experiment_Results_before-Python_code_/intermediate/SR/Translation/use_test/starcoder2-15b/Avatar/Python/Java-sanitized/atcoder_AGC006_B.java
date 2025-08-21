import java.util.*;
import java.io.*;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}