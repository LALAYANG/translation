import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_55_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Double> list1 = new ArrayList<>();
        list1.add(7.0);
        list1.add(82.0);
        list1.add(17.0);
        List<Double> list2 = new ArrayList<>();
        list2.add(89.0);
        list2.add(17.0);
        list2.add(26.0);
        TTest tTest = new TTest();
        double pValue = tTest.tTest(list1, list2);
        while (number % 2 == 0) {
            int divisor = 2;
            List<Double> list3 = new ArrayList<>();
            list3.add(84.0);
            list3.add(31.0);
            list3.add(74.0);
            Collections.shuffle(list3);
            double result = divideNumbers(number, divisor);
            number = (int) result;
        }
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double divideNumbers(int number, int divisor) {
        return number / divisor;
    }
}