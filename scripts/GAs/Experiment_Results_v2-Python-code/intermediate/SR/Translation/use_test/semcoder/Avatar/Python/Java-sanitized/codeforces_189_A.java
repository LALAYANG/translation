import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int ribbonLength = arr[0];
        int[] lengths = {arr[1], arr[2], arr[3]};
        if (ribbonLength % lengths[0] == 0) {
            System.out.println(ribbonLength / lengths[0]);
        } else {
            // Implement the logic for cutting the ribbon in Java
        }
    }
}