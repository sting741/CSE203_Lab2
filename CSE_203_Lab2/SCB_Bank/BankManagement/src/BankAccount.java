import java.util.*;

public class BankAccount {
    private int mAccNum;
    private String mName;
    private double mBalance;

    public BankAccount() {
   
    }

    public BankAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public void Input(Scanner sc) {
        System.out.print("Account number: ");
        mAccNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        mName =  sc.nextLine();
        System.out.print("Balance: ");
        mBalance = sc.nextDouble();
    }

    public void Print() {
        System.out.print(" ACCNumber: " + mAccNum + "\nName: " + mName + "\nBalance: " + mBalance);
    }

    public String Tostring() {
        return String.valueOf(mBalance);     
    }

    public void Deposit(double money) {
        this.mBalance+= money;
    }

    public boolean Withdraw(double money) {
        if(money<=0) return false;
        if(money>this.mBalance) return false;
        this.mBalance-=money;
        return true;
    }

    public boolean TransferMoney(BankAccount acc, double money) {
        if(money<=0) return false;
        if(money>this.mBalance) return false;
        this.Withdraw(money);
        acc.Deposit(money);
        return true;
    }

    public boolean CompareAccoutNumber(int acc) {
        return acc == this.mAccNum;
    }
}
