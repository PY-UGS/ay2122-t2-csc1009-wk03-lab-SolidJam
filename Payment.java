import java.text.DecimalFormat;
import java.util.*;

public class Payment {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String [] args) {

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        Scanner intRate = new Scanner(System.in);
        double L1Rate = intRate.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        Scanner noYears = new Scanner(System.in);
        int L1Years = noYears.nextInt();

        System.out.println("Enter loan amount, for example, 120000.95: ");
        Scanner amount = new Scanner(System.in);
        double L1Amount = amount.nextDouble();

        Loan L1 = new Loan(L1Rate,L1Years,L1Amount);

        System.out.println(" ");
        System.out.println("The loan was created on " + L1.getLoanDate());
        System.out.println("The monthly payment is " + df.format(L1.getMonthlyPayment()));
        System.out.println("The total payment is " + df.format(L1.getYearlyPayment()));








    }


}
