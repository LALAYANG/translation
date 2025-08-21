```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(A);
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            System.out.println(A[2] - A[1]);
        }
    }
}
``` 
