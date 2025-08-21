```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String S = scanner.next();
        if (S.length() <= K) {
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, K) + "...");
        }
    }
}
```
Note: In Java, the `substring` method is used to extract a substring from a string. The `substring` method takes two arguments: the starting index and the ending index (exclusive). In this case, we want to extract a substring from the beginning of the string to the `K`th index (exclusive), so we pass `0` as the starting index and `K` as the ending index. The `+ "..."` is used to add the ellipsis to the end of the substring.
