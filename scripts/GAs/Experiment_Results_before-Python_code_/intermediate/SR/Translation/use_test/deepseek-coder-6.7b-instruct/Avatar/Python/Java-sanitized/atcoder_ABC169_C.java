import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sa = scanner.next();
        String sb = scanner.next();
        int a = Integer.parseInt(sa);
        int b = (int) (Float.parseFloat(sb) * 100 + 0.1);
        System.out.println((a * b) / 100);
    }
}