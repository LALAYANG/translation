```
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int ans = 0;
        while (Math.pow(10, i) <= N) {
            ans += (int) (Math.pow(10, i) - Math.pow(10, i - 1));
            i += 2;
        }
        ans += Math.max(0, N - Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It first prompts the user to enter a number, and then it uses a while loop to calculate the sum of the digits of the number. The while loop continues until the number is less than 10, at which point it breaks. The sum of the digits is then printed to the console.

Note that the code uses the `Math.pow()` method to calculate the powers of 10, and the `Math.max()` method to calculate the maximum of two numbers. It also uses the `Scanner` class to read input from the user.
