class User: 
    def init(self, username, email_address):
        self.name = username
        self.email = email_address
        self.account_balance = 0

    def make_deposit(self, amount):
        self.account_balance += amount
        return self

    def make_withdrawal(self, amount):
        self.account_balance -= amount
        return self

    def transfer_money(self, other_user, amount):
        self.account_balance -= amount
        other_user.account_balance += amount
        return self

    def display_user_balance(self):
        print(f"User: {self.name}, Balance: {self.account_balance}")
        return self
        # print('hello')

izz = User("izz", "izz.com")
ahmad = User("ahmad", "ahmad.com")
issa = User("issa", "issa.com")

izz.make_deposit(200).make_deposit(200).make_deposit(200).make_withdrawal(50).display_user_balance()
ahmad.make_deposit(300).make_deposit(300).make_withdrawal(100).make_withdrawal(100).display_user_balance()
issa.make_deposit(1000).make_withdrawal(300).make_withdrawal(300).make_withdrawal(300).display_user_balance()
print("balanced after transfers::")
izz.transfer_money(ahmad, 500).display_user_balance()
ahmad.display_user_balance()