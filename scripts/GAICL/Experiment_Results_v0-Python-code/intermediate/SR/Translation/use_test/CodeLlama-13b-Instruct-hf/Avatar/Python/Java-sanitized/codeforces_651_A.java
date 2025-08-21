import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_651_A {

    public static void main(String[] args) {
        int x = 24;
        int y = 15;
        int sum = calculateSum(x, y);
        System.out.println(sum);
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int sumE(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sumA(int arg0, int arg1) {
        return sumE(arg0, arg1);
    }

    public static int sumC(int arg0, int arg1) {
        return sumA(arg0, arg1);
    }

    public static int sumB(int arg0, int arg1) {
        return sumC(arg0, arg1);
    }

    public static int sumD(int arg0, int arg1) {
        return sumB(arg0, arg1);
    }

    public static int myDecorator(int func) {
        return func;
    }

    public static int calculateSumDecorated(int a, int b) {
        return myDecorator(sumD(a, b));
    }

    public static int[] shuffle(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] ttestInd(int[] arr1, int[] arr2) {
        // Implement ttest_ind here
        return new int[0];
    }

    public static int[] readIntArray() {
        return new int[0];
    }

    public static int readInt() {
        return 0;
    }

    public static String readString() {
        return "";
    }
}