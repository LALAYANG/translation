import java.util.Random;

public class codeforces_617_B {
    public static int add(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sum_values(int arg0, int arg1) {
        return add(arg0, arg1);
    }

    public static int shuffle_and_sum(int arg0, int arg1) {
        Random rand = new Random();
        int[] arr = {55, 17, 49};
        rand.shuffle(arr);
        return sum_values(arg0, arg1);
    }

    public static int handle_data(int arg0, int arg1) {
        return shuffle_and_sum(arg0, arg1);
    }

    public static int process_data(int arg0, int arg1) {
        return handle_data(arg0, arg1);
    }

    public static int transform_data(int arg0, int arg1) {
        return process_data(arg0, arg1);
    }

    public static int calculate(int arg0, int arg1) {
        return transform_data(arg0, arg1);
    }

    public static int my_decorator(int func) {

        int dec_result = func;
        return dec_result;
    }

    @my_decorator
    public static int combine(int a, int b) {
        return calculate(a, b);
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        for (int i = 0; i < 100; i++) {
            b = add(b, 0);
        }
        System.out.println(b);
    }
}