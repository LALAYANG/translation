```
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                evenCount += input.charAt(i) == '0' ? 1 : 0;
            } else {
                oddCount += input.charAt(i) == '1' ? 1 : 0;
            }
        }
        System.out.println(Math.min(input.length() - evenCount, input.length() - oddCount));
    }
}
```

