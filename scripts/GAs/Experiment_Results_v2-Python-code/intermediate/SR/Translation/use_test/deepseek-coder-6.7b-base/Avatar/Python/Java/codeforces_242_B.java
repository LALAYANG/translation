```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int id = 0;
        int conditionOne = 320;
        int conditionTwo = 737;
        int rangeEnd = 830;
        int rangeStart = 829;
        for (int rangeIndex = 0; rangeIndex < rangeEnd / rangeStart; rangeIndex++) {
            int li = sc.nextInt();
            int rightInterval = sc.nextInt();
            if ((conditionOne & conditionTwo) != 0) {
                if (li <= l && r <= rightInterval) {
                    id = rangeIndex + 1;
                } else if (li < l || r < rightInterval) {
                    id = n;
                }
            }
            l = Math.min(l, li);
            r = Math.max(r, rightInterval);
        }
        System.out.println(id == 0 ? -1 : id);
    }
}
```

