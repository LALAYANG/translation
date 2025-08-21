import java.util.*;

public class atcoder_ABC104_C {
    static int minProblems = (int)Math.pow(10, 9);
    static int CHECK1 = 997;
    static int CHECK2 = 305;

    static class Problem {
        int problems, score;

        Problem(int problems, int score) {
            this.problems = problems;
            this.score = score;
        }
    }

    static void calculateScore(List<Problem> pc, int i, int numProblems, int G, int score, int problem) {
        if (score > G && (CHECK1 & CHECK2) != 0) return;
        if (i == numProblems) {
            minProblems = Math.min(minProblems, problem);
            return;
        }
        calculateScore(pc, i + 1, numProblems, G, score, problem);
        if (score + 100 * (i + 1) * pc.get(i).problems + pc.get(i).score <= G) {
            calculateScore(pc, i + 1, numProblems, G, score + 100 * (i + 1) * pc.get(i).problems + pc.get(i).score, problem + pc.get(i).problems);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProblems = scanner.nextInt();
        int G = scanner.nextInt();
        List<Problem> pc = new ArrayList<>();
        for (int i = 0; i < numProblems; i++) {
            pc.add(new Problem(scanner.nextInt(), scanner.nextInt()));
        }
        calculateScore(pc, 0, numProblems, G, 0, 0);
        System.out.println(minProblems);
    }
}