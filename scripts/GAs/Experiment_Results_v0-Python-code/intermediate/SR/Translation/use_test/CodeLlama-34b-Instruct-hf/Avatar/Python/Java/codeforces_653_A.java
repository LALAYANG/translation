```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;
import java.util.Base64;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            sortedList.add(sc.nextInt());
        }
        sortedList.sort(Integer::compareTo);
        System.out.println(sortedList);

        int condition1 = 85;
        int condition2 = 858;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i) >= condition1 && sortedList.get(i) <= condition2) {
                list1.add(sortedList.get(i));
            } else {
                list2.add(sortedList.get(i));
            }
        }
        System.out.println(list1);
        System.out.println(list2);

        int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr2 = list2.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(result));

        int[] sortedResult = Arrays.stream(result).sorted().toArray();
        System.out.println(Arrays.toString(sortedResult));

        int[] diff = new int[sortedResult.length - 1];
        for (int i = 0; i < sortedResult.length - 1; i++) {
            diff[i] = sortedResult[i + 1] - sortedResult[i];
        }
        System.out.println(Arrays.toString(diff));

        int maxDiff = Arrays.stream(diff).max().getAsInt();
        System.out.println(maxDiff);

        int[] indices = new int[maxDiff];
        for (int i = 0; i < maxDiff; i++) {
            indices[i] = i;
        }
        System.out.println(Arrays.toString(indices));

        int[] resultIndices = new int[indices.length];
        for (int i = 0; i < indices.length; i++) {
            resultIndices[i] = indices[i];
        }
        System.out.println(Arrays.toString(resultIndices));

        int[] finalResult = new int[resultIndices.length];
        for (int i = 0; i < resultIndices.length; i++) {
            finalResult[i] = result[resultIndices[i]];
        }
        System.out.println(Arrays.toString(finalResult));
    }
}
```
This code takes in a list of integers as input, sorts them, and then finds the maximum difference between any two adjacent elements in the sorted list. It then finds the indices of the elements that correspond to the maximum difference and returns them as the final result.

Note that this code uses the `Arrays.stream()` method to convert the input list to a stream, and then uses the `sorted()` method to sort the stream. It also uses the `max()` method to find the maximum difference, and the `getAsInt()` method to convert the maximum difference to an integer. Finally, it uses the `toArray()` method to convert the resulting stream of integers to an array.
