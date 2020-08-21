public class Loan {
    private static int maxloan; //static therefore accesible to all instances made using the class
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;

        if (amount > maxloan) maxloan = amount;
    }

    public String getBorrower() {
        return this.borrower;
    }

    public int getAmount() {
        return this.amount;
    }

    public boolean isPaid() {
        return this.isPaid;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }

}
