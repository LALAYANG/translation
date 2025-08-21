Thought process:
1. Read the input integer and list of integers.
2. Perform operations based on the provided code snippet.
3. Output the results as specified.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input_num = scanner.nextInt();
        int[] lista = new int[input_num];
        
        for (int i = 0; i < input_num; i++) {
            lista[i] = scanner.nextInt();
        }
        
        for (int index = 0; index < lista.length; index++) {
            if (index == 0) {
                System.out.println(lista[index + 1] - lista[index] + " " + (lista[lista.length - 1] - lista[index]));
                continue;
            } else if (index == lista.length - 1) {
                System.out.println((lista[index] - lista[index - 1]) + " " + (lista[index] - lista[0]));
                continue;
            } else if (lista[index] - lista[index - 1] > lista[index + 1] - lista[index]) {
                System.out.print(lista[index + 1] - lista[index] + " ");
            } else {
                System.out.print(lista[index] - lista[index - 1] + " ");
            }
            
            if (lista[lista.length - 1] - lista[index] > lista[index] - lista[0]) {
                System.out.println(lista[lista.length - 1] - lista[index]);
            } else {
                System.out.println(lista[index] - lista[0]);
            }
        }
    }
}
```
