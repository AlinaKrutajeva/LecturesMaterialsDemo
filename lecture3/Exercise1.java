package lecture3;

public class Exercise1 {
        public static void main(String[] args) {
            BankProgram bank = new BankProgram();
            bank.checkBalance();
            bank.deposit(10000);
            bank.checkBalance();
            bank.deposit(1000);
            bank.checkBalance();
            bank.withdraw(700);
            bank.checkBalance();
            bank.withdraw(500);
            bank.checkBalance();
            bank.withdraw(501);
            bank.checkBalance();
        }
    }
