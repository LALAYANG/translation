```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int a = arr[n-1];
        int b = arr[0];
        if(a == b){
            System.out.println((a-b) + " " + (n*(n-1))/2);
        }else{
            int ac = 0;
            int bc = 0;
            for(int i=0; i<n; i++){
                if(arr[i] == a) ac++;
                if(arr[i] == b) bc++;
            }
            System.out.println((a-b) + " " + (ac*bc));
        }
    }
}
```

This Java code does the same thing as the provided Python code. It reads an integer n from the standard input, then reads n integers into an array. It sorts the array and calculates the difference between the maximum and minimum values. If the maximum and minimum values are the same, it calculates the number of pairs of elements in the array and prints the difference and the number of pairs. If the maximum and minimum values are different, it counts the number of occurrences of the maximum and minimum values and prints the difference and the product of these counts.

