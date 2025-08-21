```java
public class Main {
    public static void main(String[] args) {
        String LUCKY = "abcd";
        int n = 74;
        StringBuilder s = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            s.append(LUCKY.charAt(i % 4));
        }
        
        System.out.println(s.toString());
    }
}
```
