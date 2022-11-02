public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    public  double totalAmount ;
/////////////////////////////////////////////////////////////////////////////
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.totalAmount += this.checkingBalance + this.savingsBalance;
        numberOfAccounts++;
    }
/////////////////////////////////////////////////////////////////////////////

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
    public double deposit (String typeOfAccount,double amount){
        if (typeOfAccount.equals("Saving")){
            // double new_saving = (amount + getSavingsBalance());
            this.savingsBalance += amount;
        }
        else if (typeOfAccount.equals("Checking")){
            // double a2=(amount + getCheckingBalance());
            this.checkingBalance += amount;
        }
        return (this.checkingBalance + this.savingsBalance);
        // return 
        // System.out.println("the total balance is: " + totalAmount);
        // System.out.println("the saving balance is: " + a1);
        // System.out.println("the checking balance is: " + a2);
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
        // return
        // System.out.println("the total balance is: "+totalAmount);
        // System.out.println("the saving balance is: "+a1);
        // System.out.println("the checking balance is: "+a2);
    }
/////////////////////////////////////////////////////////////////////////////
    public double display (){
        // System.out.println("the total amount of saving account is: " + a1);
        // System.out.println("the total amount of checking account is: " + a2);
        return totalAmount;
    }
/////////////////////////////////////////////////////////////////////////////
}