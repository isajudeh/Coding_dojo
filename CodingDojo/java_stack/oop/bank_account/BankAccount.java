public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalAmount = 0.0;
/////////////////////////////////////////////////////////////////////////////
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }
/////////////////////////////////////////////////////////////////////////////
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
/////////////////////////////////////////////////////////////////////////////
    public void deposit (String typeOfAccount,double amount){
        if (typeOfAccount=="Saving"){
            double a1=(amount + getSavingsBalance());
            totalAmount = totalAmount + amount;
        }
        else if (typeOfAccount=="Checking"){
            double a2=(amount + getCheckingBalance());
            totalAmount = totalAmount + amount;
        }
    }
/////////////////////////////////////////////////////////////////////////////
    public void withdraw (String typeOfAccount,double amount){
        double sum = totalAmount-amount;
        if ((sum == amount) || (sum > amount)){
            if (typeOfAccount=="Saving"){
                double a1=(getSavingsBalance() - amount);
                totalAmount = totalAmount - amount;
            }
            else if (typeOfAccount=="Checking"){
                double a2=(getCheckingBalance() - amount);
                totalAmount = totalAmount - amount;
            }
        }
        else {
            System.out.println("insufficient funds!");
        }
    }
/////////////////////////////////////////////////////////////////////////////
    public double display (){
        // System.out.println("the total amount of saving account is: " + a1);
        // System.out.println("the total amount of checking account is: " + a2);
        return totalAmount;
    }
/////////////////////////////////////////////////////////////////////////////
}