class user:
    def __init__(self,name,email):
        self.name=name
        self.email=email
        self.account_balance=0
    def make_withdrawal(self,amount):
        self.account_balance -= amount
    def display_user_balance(self):
        print(self.account_balance)
    def transfer_money(self,other_user, amount):
        self.account_balance -= amount
        other_user.account_balance += amount
        
isa=user('ISA','isajudeh@yahoo.com')
judeh=user('judeh','judeh@gmail.com')
isa.display_user_balance()
isa.make_withdrawal(200)
isa.display_user_balance()
isa.transfer_money(judeh,500)
isa.display_user_balance()
judeh.display_user_balance()
