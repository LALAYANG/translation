```java
public class Main {
    public static void main(String[] args) {
        int fourthCondition = 842;
        int fifthCondition = 952;
        int secondCondition = 819;
        int isDivisible = 253;
        
        int arrayLength = 14;
        int[] number = {7, 7, 7, 7, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4};
        
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        
        int outerLoopEnd = 738;
        int innerLoopEnd = 737;
        int firstCondition = 305;
        int thirdCondition = 108;
        
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / innerLoopEnd; LoopIndexOut++) {
            for (int i = 0; i < arrayLength; i++) {
                if ((firstCondition & thirdCondition) != 0) {
                    if (number[i] != 4 && number[i] != 7) {
                        System.out.println("NO");
                        x++;
                        break;
                    }
                }
                if (i < arrayLength / 2) {
                    h1 += number[i];
                } else {
                    h2 += number[i];
                }
            }
        }
        
        if ((fourthCondition & fifthCondition) != 0) {
            if ((secondCondition & isDivisible) != 0) {
                if (x == 0) {
                    if (h1 == h2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
```
