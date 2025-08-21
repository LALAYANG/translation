
```
public class Main {
    public static void main(String[] args) {
        String LUCKY = "abcd";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += LUCKY.charAt(i % 4);
        }
        System.out.println(s);
    }
}

```

