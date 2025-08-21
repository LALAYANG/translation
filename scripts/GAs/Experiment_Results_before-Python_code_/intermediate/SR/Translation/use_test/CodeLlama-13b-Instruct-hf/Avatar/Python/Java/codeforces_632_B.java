```java
public class BobsMaxStrength {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        String[] pieces = {"AAAAA"};
        System.out.println(Bob_sMaxStrength(input, pieces));
    }

    public static int Bob_sMaxStrength(int[] input, String[] pieces) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < input.length; i++) {
            if (pieces[i].equals("B")) {
                pScore += input[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= input[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i].equals("A")) {
                sScore += input[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= input[i];
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}
```
Note: The code is written in Java 8, and it uses the `String.equals()` method to compare the strings.

Also, the code uses the `System.out.println()` method to print the result to the console.

The code first defines the `main()` method, which takes an array of integers and an array of strings as input. It then calls the `Bob_sMaxStrength()` method with the input arrays as arguments.

The `Bob_sMaxStrength()` method takes two arrays as input: an array of integers and an array of strings. It first initializes the `pScore`, `sScore`, `pMaxScore`, and `sMaxScore` variables to 0.

It then iterates through the input arrays using a for loop, and for each element in the input arrays, it checks if the corresponding element in the other array is "B" or "A". If it is "B", it adds the element to the `pScore`, and if it is "A", it adds the element to the `sScore`.

After the for loop, it checks if the `pMaxScore` is greater than the `sMaxScore`, and if it is, it returns the `pMaxScore`. Otherwise, it returns the `sMaxScore`.

Finally, the code prints the result to the console using the `System.out.println()` method.
