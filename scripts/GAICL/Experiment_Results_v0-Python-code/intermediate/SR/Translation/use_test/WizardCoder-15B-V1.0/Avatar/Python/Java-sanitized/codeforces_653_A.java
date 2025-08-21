import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class codeforces_653_A {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        List<Integer> sortedList = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
        int condition1 = 85;
        int condition2 = 858;
        double[] arr1 = {72, 85, 75};
        double[] arr2 = {77, 36, 2};
        ttest_ind(arr1, arr2);
        for (int value : sortedList) {
            if ((condition1 & condition2) != 0) {
                if (sortedList.contains(value + 1) && sortedList.contains(value + 2)) {
                    System.out.println("YES");
                    break;
                }
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void ttest_ind(double[] arr1, double[] arr2) {
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                int temp = (int) arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                arr1[i] += rand.nextDouble();
                arr2[i] += rand.nextDouble();
            }
        }
    }
}