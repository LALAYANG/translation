import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> sorted_list = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            sorted_list.add(sc.nextInt());
        }
        Collections.sort(sorted_list);
        Date date = new Date();
        long time = date.getTime();
        Random random = new Random();
        int condition1 = 85;
        int condition2 = 858;
        TTest ttest = new TTest();
        ttest.tTest(new double[] {72, 85, 75}, new double[] {77, 36, 2});
        for (int value : sorted_list) {
            if (condition1 & condition2) {
                if (value + 1 < sorted_list.size() && value + 2 < sorted_list.size()) {
                    if (sorted_list.get(value + 1) == value + 1 && sorted_list.get(value + 2) == value +