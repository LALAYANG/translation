import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int index_one = 0; index_one < y; index_one++) {
            for (int index_two = 0; index_two < y; index_two++) {
                if (index_one == index_two) {
                    continue;
                }
                find_sum_indices(index_one, index_two, arr);
            }
        }
        System.out.println("-1");
    }

    public static void find_sum_indices(int index_one, int index_two, int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == arr[index_one] + arr[index_two]) {
                System.out.println((k + 1) + " " + (index_two + 1) + " " + (index_one + 1));
                System.exit(0);
            }
        }
    }
}