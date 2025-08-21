import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        list.add(73);
        list.add(84);
        list.add(14);
        Collections.shuffle(list);
        TTest tTest = new TTest();
        double[] sample1 = {98, 4, 11};
        double[] sample2 = {32, 25, 31};
        double t = tTest.tTest(sample1, sample2);
        int[] userArray = new int[userInput];
        for (int i = 0; i < userInput; i++) {
            userArray[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < userInput; i++) {
            sum += userArray[i];
        }
        System.out.println(sum);
        if (userInput == 10 || userInput == 100 || userInput == 1000 || userInput == 10000 || userInput == 100000) {
            System.out.println(10);
        } else {
            System.out.println(sum);
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}