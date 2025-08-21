```java
import java.util.*;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(sc.nextLine());
        }
        String f = "Yes";
        int[] arr1 = {47, 81, 36};
        int[] arr2 = {18, 47, 56};
        ttest_ind(arr1, arr2);
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        Date date = new Date();
        shuffle(arr1);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if (conditionCheck1 & conditionCheck2 != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && !v.startsWith(charList.get(i).charAt(0))) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        double t = ttest_ind(arr1, arr2)[0];
        double p = ttest_ind(arr1, arr2)[1];
        if (p < 0.05) {
            System.out.println("Different");
        } else {
            System.out.println("Similar");
        }
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```
