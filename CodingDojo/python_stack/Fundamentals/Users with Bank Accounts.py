
from BankAccount import BankAccount


class user:
    def __init__(self,name,email,type):
        self.name=name
        self.email=email
        self.type=type
        self.account=BankAccount(int_rate=0.01,balance=0)
        
    def make_deposite(self,amount,type):
        self.account.deposit(amount)
        
    def make_withdrawal(self,amount,type):
        self.account.withdraw(amount)
        
    def display_user_balance(self,type):
        print(self.account.balance,type)

lolo=user('ISA','isajudeh@yahoo.com','saver')
zozo=user('momo','koko@gmail.com','transfer')
lolo.make_deposite(200,'saver')
print(lolo.display_user_balance('saver'))
