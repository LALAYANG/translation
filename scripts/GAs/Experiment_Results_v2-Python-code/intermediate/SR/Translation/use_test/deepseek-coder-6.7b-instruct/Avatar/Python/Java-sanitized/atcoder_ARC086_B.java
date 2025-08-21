import java.util.*;
import java.lang.*;

class Main {
    static Scanner scanner = new Scanner(System.in);
    static int modulo_value = (int)Math.pow(10, 9) + 7;

    static int I() {
        return scanner.nextInt();
    }

    static int[] III() {
        int n = I();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = I();
        }
        return arr;
    }

    static int my_sign(int x) {
        return (x > 0) - (x < 0);
    }

    public static void main (String[] args) {
        int count = I();
        int[] a = III();
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int index = 0; index < a.length; index++) {
            if (Math.abs(a[index]) > max_val) {
                max_val = Math.abs(a[index]);
                max_sign = my_sign(a[index]);
                max_index = index;
            }
        }
        if ((621 & 643) != 0) {
            if (max_sign == 0) {
                System.out.println(0);
            } else if (max_sign == 1) {
                System.out.println(2 * count - 1);
                recursive_loop(0, count, 1);
                for (int index = 0; index < count - 1; index++) {
                    System.out.println((index + 1) + " " + (index + 2));
                }
            } else {
                System.out.println(2 * count - 1);
                for (int index = 0; index < count; index++) {
                    System.out.println((max_index + 1) + " " + (index + 1));
                }
                for (int index = count - 1; index > 0; index--) {
                    System.out.println((index + 1) + " " + index);
                }
            }
        }
    }

    static void recursive_loop(int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        System.out.println((max_index + 1) + " " + (index + 1));
        recursive_loop(index + step, stop, step);
    }
}