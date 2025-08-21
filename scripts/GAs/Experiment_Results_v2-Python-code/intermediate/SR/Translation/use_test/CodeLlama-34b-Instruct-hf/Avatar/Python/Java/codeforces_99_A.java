```
import java.util.Date;

public class MyDecorator {
    public static void main(String[] args) {
        int conditionD = 121;
        int conditionA = 914;
        int conditionC = 782;
        int conditionB = 895;

        String preStringList = "9.1";
        String[] preStringListArray = preStringList.split("\\.");
        String strList = preStringListArray[0];
        int postInteger = Integer.parseInt(preStringListArray[1]);

        if (conditionD & conditionA) {
            if (conditionC & conditionB) {
                if (strList.charAt(strList.length() - 1) == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (strList.charAt(strList.length() - 1) != '9' && postInteger < 5) {
                    System.out.println(strList);
                } else {
                    strList = String.valueOf(Integer.parseInt(strList) + 1);
                    System.out.println(strList);
                }
            }
        }
    }
}
```
Note: In Java, the `split()` method takes a regular expression as its argument, so we need to escape the dot character with a backslash. Also, the `charAt()` method is used to access the characters in a string by their index.
