```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String new_t = sc.nextLine();
        sc.close();
        int[] s_arr = new int[26];
        int[] new_t_arr = new int[26];
        for(int i=0;i<s.length();i++){
            s_arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<new_t.length();i++){
            new_t_arr[new_t.charAt(i)-'a']++;
        }
        Arrays.sort(s_arr);
        Arrays.sort(new_t_arr);
        if(Arrays.equals(s_arr,new_t_arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
```
