import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x_coordinate = scanner.nextInt();
        int y = scanner.nextInt();
        int a = 0;
        int loop_bound_two = 463;
        int loop_bound_one = 462;
        while (loop_bound_two % loop_bound_one == 1) {
            loop_bound_two = loop_bound_two + 1;
            while (x_coordinate >= 0 && y >= 22 || (x_coordinate >= 1 && y >= 12) || (x_coordinate >= 2 && y >= 2)) {
                int condition_one = 293;
                int condition_two = 290;
                if (condition_one & condition_two) {
                    if (a != 0) {
                        if (y >= 22) {
                            y = y - 22;
                        } else if (x_coordinate >= 1 && y >= 12) {
                            x_coordinate -= 1;
                            y -= 12;
                        } else {
                            x_coordinate -= 2;
                            y -= 2;
                        }
                    } else if (x_coordinate >= 2 && y >= 2) {
                        x_coordinate -= 2;
                        y -= 2;
                    } else if (x_coordinate >= 1 && y >= 12) {
                        x_coordinate -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                int initial_variable = 1;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> calculate(initial_variable, a));
                int result_calculation = future.get();
                a = result_calculation;
            }
        }
        System.out.println(a == 0 ? "Ciel" : "Hanako");