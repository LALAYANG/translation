<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
AAAAA

Expected output:
15


```
def main ( ) :
    input ( )
    pieces = tuple ( zip ( map ( int , input ( ).split ( ) ) , input ( ) ) )
    return Bob_sMaxStrength ( pieces )
def Bob_sMaxStrength ( pieces ) :
    pScore = sScore = pMaxScore = sMaxScore = sum ( piece [ 0 ] for piece in pieces if piece [ 1 ] == 'B' )
    for piece in pieces :
        if piece [ 1 ] == 'A' :
            pScore += piece [ 0 ]
            if pScore > pMaxScore :
                pMaxScore = pScore
        else :
            pScore -= piece [ 0 ]
    for i in range ( len ( pieces ) - 1 , - 1 , - 1 ) :
        if pieces [ i ] [ 1 ] == 'A' :
            sScore += pieces [ i ] [ 0 ]
            if sScore > sMaxScore :
                sMaxScore = sScore
        else :
            sScore -= pieces [ i ] [ 0 ]
    if pMaxScore > sMaxScore :
        return pMaxScore
    return sMaxScore
if __name__ == '__main__' :
    print ( main ( ) )


```
[/INST]
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
        } else {
            return sMaxScore;
        }
    }
}
```
Note: In the Java code, I have used a 2D array to store the pieces and their corresponding scores. The `bobMaxStrength` method takes the 2D array as input and returns the maximum score that Bob can achieve. The method first iterates through the array and calculates the score for Bob and then iterates through the array in reverse order to calculate the score for Alice. Finally, it compares the two scores and returns the maximum score.</s>
