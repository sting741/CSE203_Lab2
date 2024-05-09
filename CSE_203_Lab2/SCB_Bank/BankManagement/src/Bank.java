
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    ArrayList<BankAccount> listAcc = new ArrayList<>();

    public Bank() {

    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input N (Accout bank): ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            BankAccount acc = new BankAccount();
            acc.Input(sc);
            listAcc.add(acc);
        }
    }

    public void Print() {
        for (int i = 0; i < listAcc.size(); i++)
            listAcc.get(i).Print();
    }

    public void Deposit1Account() {
        int accNumber;
        double money;
        System.out.print("Input accout number: ");
        Scanner sc = new Scanner(System.in);
        accNumber = sc.nextInt();
        System.out.println("Input money: ");
        money = sc.nextDouble();
        for (int i = 0; i < listAcc.size(); i++)
            if (listAcc.get(i).CompareAccoutNumber(accNumber))
                listAcc.get(i).Deposit(money);
    }

    public void TransferMoney() {
        int accNumberRe, accNumberSen;
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input money: ");
        money = sc.nextDouble();
        System.out.print("Accout 1: ");
        accNumberSen = sc.nextInt();
        System.out.print("Accout 2: ");
        accNumberRe = sc.nextInt();
        BankAccount acc1 = null, acc2 = null;
        for(int i = 0;i<listAcc.size();i++)
            if(listAcc.get(i).CompareAccoutNumber(accNumberSen)){
                listAcc.get(i).Withdraw(money);
                listAcc.get(i).Deposit(money);
            }
        
    }
}
