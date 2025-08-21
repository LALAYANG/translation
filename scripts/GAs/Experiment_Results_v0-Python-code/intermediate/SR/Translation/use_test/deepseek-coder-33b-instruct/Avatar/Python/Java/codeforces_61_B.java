```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> teamNames = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            teamNames.add(sc.next().toLowerCase().replace("-", "").replace("_", ""));
        }
        ArrayList<String> teamPermutations = new ArrayList<>();
        permute(teamNames, 0, teamNames.size() - 1, teamPermutations);
        for (int i = 0; i < sc.nextInt(); i++) {
            String submission = sc.next().toLowerCase().replace("-", "").replace("_", "");
            if (teamPermutations.contains(submission)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void permute(ArrayList<String> arr, int l, int r, ArrayList<String> teamPermutations) {
        if (l == r) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            teamPermutations.add(sb.toString());
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r, teamPermutations);
                swap(arr, l, i);
            }
        }
    }

    public static void swap(ArrayList<String> arr, int i, int j) {
        String temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
```

