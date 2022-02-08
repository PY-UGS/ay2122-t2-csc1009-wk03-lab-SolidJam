import java.time.Instant;
import java.util.*;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    public Date loanDate = Date.from( Instant.now());
    private double monthlyPayment;

    public Loan (double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        this.monthlyPayment = (getLoanAmount() * (getAnnualInterestRate()/1200)) / (1 - (1 / Math.pow((1 + (getAnnualInterestRate()/1200)), (getNumberOfYears() * 12) )));
        return monthlyPayment;
    }

    public double getYearlyPayment(){
        return (monthlyPayment * getNumberOfYears() * 12);
    }
}
