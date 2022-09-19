class BankAccount:
    def __init__(self,int_rate,balance):
        self.int_rate=int_rate
        self.balance=int(balance)
    def deposit(self,amount):
        self.balance += amount
        return self
    def withdraw(self,amount):
        if self.balance < 5:
            print("Insufficient funds: Charging a $5 fee")
        else:
            self.balance -= amount
        return self
    def display_account_info(self):
        print("Balance:$",self.balance)
        return self
    def yield_interest(self):
        if self.balance > 0:
            self.int_rate*self.balance
        return self


isa=BankAccount(0.01,10000)
judeh=BankAccount(0.01,20000)
isa.deposit(100).deposit(200).deposit(300).withdraw(400).yield_interest().display_account_info()
judeh.deposit(100).deposit(200).withdraw(100).withdraw(200).withdraw(300).withdraw(400).yield_interest().display_account_info()