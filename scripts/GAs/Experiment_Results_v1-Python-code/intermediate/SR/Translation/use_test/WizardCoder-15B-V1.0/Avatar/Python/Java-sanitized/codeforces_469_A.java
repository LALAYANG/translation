import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        int fifthValueFilter = 678;
        int sixthValueFilter = 429;
        int seventhValueFilter = 302;
        int eighthValueFilter = 736;
        int thirdValueFilter = 337;
        int fourthValueFilter = 861;
        int firstValueFilter = 125;
        int secondValueFilter = 608;
        int expectedListLength = Integer.parseInt(args[0]);
        List<Integer> firstInputList = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < expectedListLength; i++) {
            firstInputList.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }
        Collections.shuffle(y);
        firstInputList.remove(0);
        y.remove(0);
        Set<Integer> firstInputSet = new HashSet<Integer>(firstInputList);
        Set<Integer> ySet = new HashSet<Integer>(y);
        if ((thirdValueFilter & fourthValueFilter) != 0) {
            if ((firstValueFilter & secondValueFilter) != 0) {
                if (firstInputSet.contains(0)) {
                    firstInputSet.remove(0);
                }
                if (ySet.contains(0)) {
                    ySet.remove(0);
                }
            }
        }
        Set<Integer> z = new HashSet<Integer>();
        z.addAll(firstInputSet);
        z.addAll(ySet);
        if ((fifthValueFilter & sixthValueFilter) != 0) {
            if ((seventhValueFilter & eighthValueFilter) != 0) {
                if (z.size() != expectedListLength) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }
}