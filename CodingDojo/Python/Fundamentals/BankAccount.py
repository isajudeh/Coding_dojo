class BankAccount:
    def __init__(self,int_rate,balance):
        self.int_rate=int_rate
        self.balance=int(balance)
    def deposit(self,amount):
        self.balance += amount
    def withdraw(self,amount):
        if self.balance < 5:
            print("Insufficient funds: Charging a $5 fee")
        else:
            self.balance -= amount
    def display_account_info(self):
        print("Balance:$",self.balance)
    def yield_interest(self):
        if self.balance > 0:
            self.int_rate*self.balance


isa=BankAccount(0.01,10000)
isa.display_account_info()
isa.deposit(500)
isa.display_account_info()
isa.withdraw(200)
isa.display_account_info()
isa.yield_interest()
isa.display_account_info()
