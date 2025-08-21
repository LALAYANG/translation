public class codeforces_673_A {
    public static void main(String[] args) {
        double balance = 999999;
        double annualInterestRate = 0.18;

        double monthlyInterestRate = annualInterestRate / 12;

        double lowerBound = balance / 12;
        double upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12;

        while (true) {
            double monthlyPayment = (lowerBound + upperBound) / 2;
            double balanceCopy = balance;
            for (int i = 0; i < 12; i++) {
                balanceCopy = balanceCopy - monthlyPayment;
                balanceCopy = balanceCopy + balanceCopy * monthlyInterestRate;
            }
            if (balanceCopy <= 0) {
                if (Math.abs(balanceCopy) < 0.01) {
                    break;
                }
                upperBound = monthlyPayment;
            } else {
                lowerBound = monthlyPayment;
            }
        }

        System.out.println("Lowest Payment: " + String.format("%.2f", monthlyPayment));
    }
}