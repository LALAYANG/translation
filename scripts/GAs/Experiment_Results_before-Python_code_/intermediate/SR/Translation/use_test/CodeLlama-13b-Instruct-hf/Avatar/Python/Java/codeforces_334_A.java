```
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1, j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```
Note: The `args` array is used to pass command-line arguments to the program. In this case, the first argument is the value of `n`.
