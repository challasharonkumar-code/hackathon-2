import java.util.Scanner;

class BankAccount {
    int no;
    String name;
    double bal;
    BankAccount(int no, String name, double bal) {
        this.no = no;
        this.name = name;
        this.bal = bal;
    }
    void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt);
    }
    void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Not enough balance!");
        }
    }
    void show() {
        System.out.println("\nAccount No: " + no);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
    }
}
public class Bankapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No: ");
        int no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();
        BankAccount acc = new BankAccount(no, name, bal);
        System.out.print("Enter deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);
        System.out.print("Enter withdraw: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);
        acc.show();
        sc.close();
    }
}
