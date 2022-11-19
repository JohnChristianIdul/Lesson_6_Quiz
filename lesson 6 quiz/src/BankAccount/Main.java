package BankAccount;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

class BankAccount{
    String bank;
    Long accountNumber;
    String accountName;

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBank() {
        return bank;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
}

class DebitAccount extends BankAccount{
    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        if ((balance - amount) < 0){
            return;
        }
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void display(){
        System.out.println("Balance: " + (int)balance);
        System.out.println("");
    }
}

class CreditAccount extends DebitAccount{
    double creditBalance;

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void pay(double amount){
        this.creditBalance -= amount;
    }

    public void interest(double amount){
        this.creditBalance +=  amount*this.creditBalance;
    }

    public void withdraw(double amount){
        amount -= super.getBalance();
        super.setBalance(amount);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount b = null;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter account type: ");
        char ch = in.next().charAt(0);
        if(ch == 'C'){
            b = new CreditAccount();
        }
        if (ch == 'D') {
            b = new DebitAccount();
        }
        char c = '\0';
        int op = 1;

        do{
            System.out.print("Enter operation" + op + ": ");
            op++;
            c = in.next().charAt(0);
            if(c == '+'){
                double plus = in.nextDouble();
                if(b instanceof DebitAccount) {
                    ((DebitAccount) b).deposit(plus);
                } else {
                    ((CreditAccount) b).deposit(plus);
                }
                ((DebitAccount) b).display();
            } else if (c == '-'){
                double minus = in.nextDouble();
                if(b instanceof DebitAccount) {
                    ((DebitAccount) b).withdraw(minus);
                } else {
                    ((CreditAccount) b).withdraw(minus);
                }
                ((DebitAccount) b).display();
            }
        } while(c != '0');
        System.out.println("Stopping...");
    }
}

