package lecture3;

public class BankProgram {
    private int bankBalance = 0;

    public void checkBalance(){
        System.out.println(bankBalance);
    }

    public void deposit(int amount) {
        if (amount >= 10000) {
            System.out.println("Need to register sum in VID");
        } else {
            bankBalance = bankBalance + amount;
            System.out.println("You have deposited " + amount + " euros");
        }
    }

    public void withdraw(int amount) {
        if (amount >= 700) {
            System.out.println("Daily limit exceeded");
        } else {
            if (bankBalance - amount < 0) {
                System.out.println("You don't have enough money");
            } else {
                bankBalance = bankBalance - amount;
                System.out.println("You have " + amount + " euros on your bank account");
            }
        }
    }
}
