import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(Math.max(Math.max(a * multiplier, b * d), Math.max(a * d, b * multiplier)));
    }
}