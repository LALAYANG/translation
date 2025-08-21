```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> s = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextLine());
        }
        String f = "Yes";
        char prev = ' ';
        for (String v : l) {
            s.put(v, s.getOrDefault(v, 0) + 1);
            if (s.get(v) >= 2) {
                f = "No";
            }
            if (prev != ' ' && prev != v.charAt(0)) {
                f = "No";
            }
            prev = v.charAt(0);
        }
        System.out.println(f);
    }
}
```

Explanation:

- We first import the necessary classes from the java.util package.
- We create a Scanner object to read input from the user.
- We read the number of strings to be checked from the user and create an empty HashMap to store the frequency of each string.
- We read the strings from the user and add them to a List.
- We initialize a variable f to "Yes" and a variable prev to ' '.
- We iterate over the List and for each string, we check if its frequency is greater than or equal to 2. If it is, we set f to "No".
- We also check if the previous character of the current string is not equal to the first character of the previous string. If it is, we set f to "No".
- We update the value of prev to the first character of the current string.
- Finally, we print the value of f.
