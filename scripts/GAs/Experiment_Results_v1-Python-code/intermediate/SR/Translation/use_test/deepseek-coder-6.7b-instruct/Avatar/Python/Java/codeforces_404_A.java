```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        scanner.nextLine();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < matrixSize; i++) {
            s.add(scanner.nextLine());
        }
        List<Character> d1 = new ArrayList<>();
        List<Character> d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();
        int checkConditionTwo = 482;
        int checkConditionOne = 245;
        for (int i = 0; i < matrixSize; i++) {
            for (int innerLoopIndex = 0; innerLoopIndex < matrixSize; innerLoopIndex++) {
                if ((checkConditionTwo & checkConditionOne) != 0) {
                    if (i == innerLoopIndex) {
                        d1.add(s.get(i).charAt(innerLoopIndex));
                    }
                    if (i == matrixSize - innerLoopIndex - 1) {
                        d2.add(s.get(i).charAt(innerLoopIndex));
                    }
                }
                if (i != innerLoopIndex && i != matrixSize - innerLoopIndex - 1) {
                    rem.add(s.get(i).charAt(innerLoopIndex));
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).size() != 1) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).equals(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `matrixSize` and `matrixSize` strings from the input. It then processes these strings and checks if certain conditions are met. If all conditions are met, it prints "YES", otherwise it prints "NO".

