import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int[] arr = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < inputNumber; i++) {
            for (int j = i + 1; j < inputNumber; j++) {
                if (arr[i] != arr[j] && arr[i] + arr[j] == arr[i + 1]) {
                    System.out.println(i + 1 + " " + j + 1 + " " + (i + 1));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}