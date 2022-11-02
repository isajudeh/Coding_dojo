class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount(200.2,500.5);
        double tot = account1.display();
        System.out.println(tot);
    }
}