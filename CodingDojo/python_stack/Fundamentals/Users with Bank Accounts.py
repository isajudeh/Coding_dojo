# class BankAccount:
#     def __init__(self,int_rate,balance):
#         self.int_rate=int_rate
#         self.balance=int(balance)
#     def deposit(self,amount):
#         self.balance += amount
#         return self
#     def withdraw(self,amount):
#         if self.balance < 5:
#             print("Insufficient funds: Charging a $5 fee")
#         else:
#             self.balance -= amount
#         return self
#     def display_account_info(self):
#         print("Balance:$",self.balance)
#         return self
#     def yield_interest(self):
#         if self.balance > 0:
#             self.int_rate*self.balance
#         return self


# isa=BankAccount(0.01,10000)
# judeh=BankAccount(0.01,20000)
# isa.deposit(100).deposit(200).deposit(300).withdraw(400).yield_interest().display_account_info()
# judeh.deposit(100).deposit(200).withdraw(100).withdraw(200).withdraw(300).withdraw(400).yield_interest().display_account_info()


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
        
    # def transfer_money(self,other_user, amount):
    #     self.account -= amount
    #     other_user.account += amount
    
lolo=user('ISA','isajudeh@yahoo.com','saver')
zozo=user('momo','koko@gmail.com','transfer')
lolo.make_withdrawal(200,'saver')
print(lolo.display_user_balance('saver'))

# isa=user('ISA','isajudeh@yahoo.com')
# judeh=user('judeh','judeh@gmail.com')
# isa.display_user_balance()
# isa.make_withdrawal(200)
# isa.display_user_balance()
# isa.transfer_money(judeh,500)
# isa.display_user_balance()
# judeh.display_user_balance()
