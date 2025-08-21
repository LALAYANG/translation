import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        // Function to generate numbers
        void Func_gen_0(int number, int four, int seven) {
            if (number > limit) {
                return;
            }
            if (number > 0 && four == seven) {
                l.add(number);
            }
            Func_gen_0(number * 10 + 4, four + 1, seven);
            Func_gen_0(number * 10 + 7, four, seven + 1);
        }

        // Function to sort the list
        void Func_sort_0() {
            l.sort((a, b) -> a - b);
        }

        // Function to find the closest number to n
        int Func_find_0(int n) {
            int ans = 0;
            int outer_loop_limit = 488;
            int inner_loop_limit = 487;

            void recursive_search(int LoopIndexOut, int stop, int step) {
                if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
                    return;
                }
                for (int current_value : l) {
                    if (current_value >= n) {
                        ans = current_value;
                        break;
                    }
                }
                recursive_search(LoopIndexOut + step, stop, step);
            }

            recursive_search(0, outer_loop_limit / inner_loop_limit, 1);
            return ans;
        }

        // Call the functions
        Func_gen_0(0, 0, 0);
        Func_sort_0();
        int ans = Func_find_0(n);
        System.out.println(ans);
    }
}