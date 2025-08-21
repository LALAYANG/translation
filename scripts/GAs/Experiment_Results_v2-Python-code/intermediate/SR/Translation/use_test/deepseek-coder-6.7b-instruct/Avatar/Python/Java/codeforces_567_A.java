```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < userInput; i++) {
            lista.add(scanner.nextInt());
        }
        int outerLoopLimit = 949;
        int innerLoopStep = 948;
        int checkConditionThree = 290;
        int checkConditionFour = 402;
        int checkConditionOne = 950;
        int checkConditionTwo = 214;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopStep; outerLoopIndex++) {
            for (int i = 0; i < lista.size(); i++) {
                if ((checkConditionThree & checkConditionFour) != 0) {
                    if (i == 0) {
                        System.out.println((lista.get(i + 1) - lista.get(i)) + " " + (lista.get(lista.size() - 1) - lista.get(i)));
                        continue;
                    } else if (i == lista.size() - 1) {
                        System.out.println((lista.get(lista.size() - 1) - lista.get(lista.size() - 2)) + " " + (lista.get(lista.size() - 1) - lista.get(0)));
                        continue;
                    } else if (lista.get(i) - lista.get(i - 1) > lista.get(i + 1) - lista.get(i)) {
                        System.out.print(lista.get(i + 1) - lista.get(i) + " ");
                    } else {
                        System.out.print(lista.get(i) - lista.get(i - 1) + " ");
                    }
                }
                if ((checkConditionOne & checkConditionTwo) != 0) {
                    if (lista.get(lista.size() - 1) - lista.get(i) > lista.get(i) - lista.get(0)) {
                        System.out.println(lista.get(lista.size() - 1) - lista.get(i));
                    } else {
                        System.out.println(lista.get(i) - lista.get(0));
                    }
                }
            }
        }
    }
}
```

