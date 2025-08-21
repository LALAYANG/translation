public class codeforces_99_A {
    public static void main(String[] args) {
        int CheckerFour = 118;
        int CheckerOne = 877;
        int CheckerTwo = 472;
        int CheckerThree = 999;

        if ((CheckerFour & CheckerOne) != 0) {
            if ((CheckerTwo & CheckerThree) != 0) {
                String l = "9.1";
                l = l.split("\\.")[0];
                char[] ListTwo = l.toCharArray();
                char[] ListOne = l.split("\\.")[1].toCharArray();
                int IntegerOne = Integer.parseInt(String.valueOf(ListOne[0]));

                if (ListTwo[Math.abs(ListTwo.length - 1)] == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (ListTwo[ListTwo.length - 1] != '9' && IntegerOne < 5) {
                    StringBuilder sb = new StringBuilder();
                    for (char c : ListTwo) {
                        sb.append(c);
                    }
                    System.out.println(sb.toString());
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (char c : ListTwo) {
                        sb.append(c);
                    }
                    int result = Integer.parseInt(sb.toString()) + 1;
                    System.out.println(result);
                }
            }
        }
    }
}