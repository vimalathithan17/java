/*
 1 - Implement a Simple Bank Account
Create a class BankAccount with instance variables accountNumber, accountHolder, and
balance. Implement methods for deposit, withdrawal, and checking the balance.
 */
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter account holder name:");
        String accountHolder=sc.next();
        BankAccount acc1=new BankAccount(accountHolder); 
        int choice;
        boolean exit=false;
        while(true)
        {
            System.out.println("Enter");
            System.out.println("1 to deposit");
            System.out.println("2 to withdraw");
            System.out.println("3 to check balance");
            System.out.println("4 to exit");
            System.out.print("enter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    int amount;
                    System.out.print("enter the amount to be deposited:");
                    amount=sc.nextInt();
                    acc1.deposit(amount);
                    break;
                case 2:
                    System.out.print("enter the amount to be withdrawed:");
                    amount=sc.nextInt();
                    acc1.withdraw(amount);
                    break;
                case 3:
                    acc1.get_balance();
                    break;
                case 4:
                    exit=true;
            }
            if (exit)
            {
                break;
            }
        }

    }
}

class BankAccount {
    private int accountNumber;
    public String accountHolder;
    private int balance;
    private static int acc_list[] = new int[10];
    private static int no_of_acc = 0;

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = generate_account_number();
        acc_list[no_of_acc] = this.accountNumber;
        no_of_acc++;
        this.balance = 0;
        System.out.println("Account created for "+this.accountHolder+" sucessfully!");
        this.get_acc_no();
        this.get_balance();
    }

    private int generate_account_number()
    {
        while(true)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(999,  9999+ 1);
            boolean is_present=false;
            for(int i=0;i<no_of_acc;i++)
            {
                if(randomNum==acc_list[i])
                {
                    is_present=true;
                    break;
                }
            }
            if (is_present==false)
            {
                return randomNum;
            }
        }  
    }
    public void get_acc_no()
    {
        System.out.println("account number:"+this.accountNumber);
    }
    public void deposit(int amount)
    {
        this.balance+=amount;
        System.out.println("amount "+amount+" deposited.");
        this.get_balance();
    }
    public void get_balance()
    {
        System.out.println("Current balance:Rs"+this.balance);
    }
    public void withdraw(int amount)
    {
        if(amount>this.balance)
        {
            System.out.println("the amount you are trying to withdraw is more than your account balance.\nWithdraw failed!");
        }
        else{
            this.balance-=amount;
            System.out.println("Withdraw sucessful.");
            this.get_balance();
        }
    }


}