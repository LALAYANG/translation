import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Query> queries = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            queries.add(new Query(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        for (Query query : queries) {
            int k = computeIntegerDivision(query.dividend, query.divisor);
            System.out.println(k * query.multiplier >= query.dividend ? "Yes" : "No");
        }
    }

    private static int computeIntegerDivision(int dividend, int divisor) {
        return dividend / divisor;
    }

    static class Query {
        int dividend;
        int divisor;
        int multiplier;

        Query(int dividend, int divisor, int multiplier) {
            this.dividend = dividend;
            this.divisor = divisor;
            this.multiplier = multiplier;
        }
    }
}