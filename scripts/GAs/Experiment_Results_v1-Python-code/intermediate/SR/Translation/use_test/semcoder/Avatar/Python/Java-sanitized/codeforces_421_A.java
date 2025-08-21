import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input processing
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[a];
        int[] listb = new int[b];
        for (int i = 0; i < a; i++) {
            lista[i] = scanner.nextInt();
        }
        for (int i = 0; i < b; i++) {
            listb[i] = scanner.nextInt();
        }

        // Constants
        int condition_checker_two = 368;
        int condition_checker_one = 889;
        int loop_boundary = 955;
        int step_size = 954;

        // Function to perform recursive operation
        void recursive_function(int k, int stop, int step) {
            if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
                return;
            }
            if ((condition_checker_two & condition_checker_one) != 0) {
                if (k + 1 in lista) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            }
            recursive_function(k + step, stop, step);
        }

        // Call the recursive function
        recursive_function(0, n, 1);
    }
}