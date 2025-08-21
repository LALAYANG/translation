```
public class BobsMaxStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pieces = new int[n][2];
        for (int i = 0; i < n; i++) {
            pieces[i][0] = sc.nextInt();
            pieces[i][1] = sc.nextInt();
        }
        System.out.println(bobMaxStrength(pieces));
    }

    public static int bobMaxStrength(int[][] pieces) {
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i][1] == 'B') {
                pScore += pieces[i][0];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= pieces[i][0];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i][1] == 'A') {
                sScore += pieces[i][0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i][0];
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}
```
Note: In the Java code, I have used a 2D array `pieces` to store the input data, where each element of the array is a pair of integers representing the strength and the type of the piece (either 'B' or 'A'). The `bobMaxStrength` method takes this 2D array as input and returns the maximum strength that Bob can achieve by selecting a subset of the pieces. The method works by iterating over the pieces and keeping track of the current score and the maximum score achieved so far. If the current score is greater than the maximum score, the maximum score is updated. The method then returns the maximum score.
