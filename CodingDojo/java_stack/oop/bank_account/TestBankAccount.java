class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount(200,500);
        BankAccount account2= new BankAccount(100.0,400.0);
        double add= account1.deposit("Saving", 100.0);

        System.out.println(add);
    }
}