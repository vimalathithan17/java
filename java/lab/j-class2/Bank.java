/*
 *6 - Bank Management System
Design a class Bank with a list of BankAccount objects. Implement methods to add accounts,
find an account by account number, calculate the total balance, and display account details.
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Bank {

  private static final Scanner scanner = new Scanner(System.in);
  private List<BankAccount> acc_list = new ArrayList<BankAccount>();

  public int generate_account_number() {
    while (true) {
      int randomNum = ThreadLocalRandom.current().nextInt(999, 9999 + 1);
      boolean is_present = false;
      for (int i = 0; i < acc_list.size(); i++) {
        if (randomNum == acc_list.get(i).get_acc_no()) {
          is_present = true;
          break;
        }
      }
      if (is_present == false) {
        return randomNum;
      }
    }
  }

  public void addAccount(BankAccount account) {
    acc_list.add(account);
    System.out.println("Account added sucessfully");
    
  }

  public BankAccount findAccount(int accountNumber) {
    for (BankAccount acc : acc_list) {
      if (accountNumber == acc.get_acc_no()) {
        System.out.println("This is account of " + acc.accountHolder);
        return acc;
      }
    }

    System.out.println("\nNo such Account");
    return null;
  }

  public void totalBalance() {
    float total_balance = 0f;
    for (BankAccount acc : acc_list) {
      System.out.println(acc.accountHolder+acc.get_balance());
      total_balance += acc.get_balance();
    }
    System.out.println("Total balance in the bank " + total_balance);
  }

  public void accountDetails(BankAccount account) {
    System.out.println("Account Details");
    System.out.println("AccountHolder : " + account.accountHolder);
    System.out.println("AccountNumber : " + account.get_acc_no());
    System.out.println("Balance :Rs : " + account.get_balance());
  }

  public static void main(String[] args) {
    Bank bank1=new Bank();
    int choice,accountNumber;
    float amount;
    String accountHolder;
    boolean exit = false;
    BankAccount account;
    while (true) {
      System.out.println("Enter");
      System.out.println("1 to add account");
      System.out.println("2 to display account details");
      System.out.println("3 to deposit");
      System.out.println("4 to withdraw");
      System.out.println("5 to check balance");
      System.out.println("6 to calculate bank balance");
      System.out.println("7 to exit");
      System.out.print("enter your choice:");
      choice = scanner.nextInt();
      if(!(choice>=1 && choice<=7))
            {
                System.out.println("\n !! Enter a valid choice !!\n");
                continue;
            }
      
      switch (choice) {
        case 1:
        while(true)
        {
            System.out.print("enter account holder name:");
            accountHolder=scanner.next();
            bank1.addAccount(new BankAccount(accountHolder, bank1));
            System.out.print("enter 1 to add accounts else enter 0:");
            choice=scanner.nextInt();
            if (choice==0)
            {
                break;
            }
        }
        break;
        case 2:
          System.out.print("enter the account number:");
          accountNumber = scanner.nextInt();
          account=bank1.findAccount(accountNumber);
          if(!(account==null))
          {
            bank1.accountDetails(account);
          }
          break;
        case 3:
        System.out.print("enter the account number:");
          accountNumber = scanner.nextInt();
        account=bank1.findAccount(accountNumber);
          if(!(account==null))
          {
            System.out.print("enter the amount to be deposited:");
            amount=scanner.nextFloat();
            account.deposit(amount);
          }
          break;
        case 4:
          System.out.print("enter the account number:");
          accountNumber = scanner.nextInt();
        account=bank1.findAccount(accountNumber);
          if(!(account==null))
          {
            System.out.print("enter the amount to be withdrawed:");
            amount=scanner.nextFloat();
            account.withdraw(amount);;
          }
          break;
        case 5:
          System.out.print("enter the account number:");
          accountNumber = scanner.nextInt();
        account=bank1.findAccount(accountNumber);
          if(!(account==null))
          {
            System.out.println("Current balance:Rs"+ account.get_balance());
          }
          break;
        case 6:
          bank1.totalBalance();
          break;
        case 7:
          exit = true;
      }
      if (exit) {
        break;
      }
    }
  }
}

class BankAccount {

  private int accountNumber;
  public String accountHolder;
  private float balance;

  BankAccount(String accountHolder, Bank bank) {
    this.accountHolder = accountHolder;
    this.accountNumber = bank.generate_account_number();
    this.balance = 0f;
    System.out.println(
      "Account created for " + this.accountHolder + " sucessfully!"
    );
    System.out.println("account number:" + this.get_acc_no());
    this.get_balance();
  }

  public int get_acc_no() {
    return this.accountNumber;
  }

  public void deposit(float amount) {
    this.balance += amount;
    System.out.println("amount " + amount + " deposited.");
    System.out.println("Current balance:Rs" + this.get_balance());
  }

  public float get_balance() {
    return this.balance;
  }

  public void withdraw(float amount) {
    if (amount > this.balance) {
      System.out.println(
        "the amount you are trying to withdraw is more than your account balance.\nWithdraw failed!"
      );
    } else {
      this.balance -= amount;
      System.out.println("Withdraw sucessful.");
      System.out.println("Current balance:Rs" + this.get_balance());
    }
  }
}
