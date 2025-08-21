import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // call the calculate_sum function with the input value
        int result = calculate_sum(t);

        // print the result
        System.out.println(result);
    }

    // define the calculate_sum function
    public static int calculate_sum(int n) {
        // calculate the partial sum
        int partial_sum = (1 + n) * n / 2;

        // calculate the t value
        int t = 1;
        while (t <= n) {
            partial_sum -= 2 * t;
            t = t * 2;
        }

        // return the partial sum
        return partial_sum;
    }
}