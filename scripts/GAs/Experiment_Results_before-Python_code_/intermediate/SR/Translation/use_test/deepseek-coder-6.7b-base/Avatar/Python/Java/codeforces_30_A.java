```
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int X = -1000;
        while (X <= 1000) {
            if (A * (int) Math.pow(X, n) == B) {
                System.out.println(X);
                break;
            }
            X++;
        }
        if (X > 1000) {
            System.out.println("No solution");
        }
    }
}

```

