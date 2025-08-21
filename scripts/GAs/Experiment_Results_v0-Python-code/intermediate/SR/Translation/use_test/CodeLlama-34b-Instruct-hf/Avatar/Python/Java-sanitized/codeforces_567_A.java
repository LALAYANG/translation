import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            lista.add(sc.nextInt());
        }

        // perform t-test
        double[] sample1 = {41, 52, 95};
        double[] sample2 = {46, 34, 68};
        double t = ttest_ind(sample1, sample2);
        System.out.println("t-value: " + t);

        // perform shuffle
        List<Integer> shuffledList = shuffle(lista);
        System.out.println("Shuffled list: " + shuffledList);

        // perform condition check
        int condition1 = 917;
        int condition2 = 629;
        for (int i = 0; i < lista.size(); i++) {
            if (condition1 & condition2) {
                if (i == 0) {
                    System.out.println(lista.get(i + 1) - lista.get(i) + " " + lista.get(lista.size() - 1) - lista.get(i));
                    continue;
                } else if (i == lista.size() - 1) {
                    System.out.println(lista.get(lista.size() - 1) - lista.get(lista.size() - 2) + " " + lista.get(lista.size() - 1) - lista.get(0));
                    continue;
                } else if (lista.get(i) - lista.get(i - 1) > lista.get(i + 1) - lista.get(i)) {
                    System.out.print(lista.get(i + 1) - lista.get(i) + " ");
                } else {
                    System.out.print(lista.get(i) - lista.get(i - 1) + " ");
                }
            }
            if (lista.get(lista.size() - 1) - lista.get(i) > lista.get(i) - lista.get(0)) {
                System.out.println(lista.get(lista.size() - 1) - lista.get(i));
            } else {
                System.out.println(lista.get(i) - lista.get(0));
            }
        }
    }

    // t-test function
    public static double ttest_ind(double[] sample1, double[] sample2) {
        // calculate means
        double mean1 = mean(sample1);
        double mean2 = mean(sample2);

        // calculate standard deviations
        double std1 = std(sample1);
        double std2 = std(sample2);

        // calculate t-value
        double t = (mean1 - mean2) / Math.sqrt((std1 * std1) / sample1.length + (std2 * std2) / sample2.length);

        return t;
    }

    // shuffle function
    public static List<Integer> shuffle(List<Integer> lista) {
        Random random = new Random();
        List<Integer> shuffledList = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int randomIndex = random.nextInt(lista.size());
            shuffledList.add(lista.get(randomIndex));
        }
        return shuffledList;
    }

    // mean function
    public static double mean(double[] sample) {
        double sum = 0;
        for (int i = 0; i < sample.length; i++) {
            sum += sample[i];
        }
        return sum / sample.length;
    }

    // standard deviation function
    public static double std(double[] sample) {
        double mean = mean(sample);
        double sum = 0;
        for (int i = 0; i < sample.length; i++) {
            sum += Math.pow(sample[i] - mean, 2);
        }
        return Math.sqrt(sum / (sample.length - 1));
    }
}