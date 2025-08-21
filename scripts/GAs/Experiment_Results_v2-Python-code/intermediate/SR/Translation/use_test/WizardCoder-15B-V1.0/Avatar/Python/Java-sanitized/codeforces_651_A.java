import java.util.*;

public class codeforces_651_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int second_input = sc.nextInt();
        int result = sum_inputs(x, second_input);
        System.out.println(result);
    }

    public static int sum_inputs(int a, int b) {
        return a + b;
    }

    public static double ttest_ind(int[] a, int[] b) {
        return TTest.tTest(a, b);
    }

    public static int[] split_input() {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        return arr;
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static String string_input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}