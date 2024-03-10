import java.util.Scanner;

class baseAccount 
{
    String customerName; 
    long accountNumber;
    double balance;
    public void initializeAccount(String name, long number, double initialBalance)
    {
        customerName = name;
        accountNumber = number;
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;

            System.out.println("Deposit successful. New balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;

            System.out.println("Withdrawal successful. New balance: " + balance);
        }
        else
        {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public void displayBalance()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}

class savingsAccount extends baseAccount
{
    double interestRate;

    public void initializeSavingAccount(String name, long number, double initialBalance)
    {
        initializeAccount(name, number, initialBalance);
        interestRate = 3.5;
    }
    void computeInterest()
    {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest earned: " + interest);
    }
}

class currentAccount extends baseAccount
{
    double minimumBalance;
    public void initializeCurrentAccount(String name, long number, double initialBalance)
    {
        initializeAccount(name, number, initialBalance);
        minimumBalance = 1500;
    }
    public void withdraw(double amount)
    {
        if (amount > 0)
        {
            if (balance - amount >= minimumBalance)
            {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            }
            else
            {
                System.out.println("Insufficient funds. Minimum balance required: " + minimumBalance);
                balance -= 350;
            }
        }
        else
        {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Account 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Name of the Customer: ");
        String name = sc.nextLine();
        System.out.print("Enter the Customer's Account number: ");
        long accnum = sc.nextLong();
        System.out.print("Enter the Balance of the Customer: ");
        double balance = sc.nextDouble();
        System.out.print("\nEnter the type of Bank Account: Savings for a Savings Account and Current for a Current Account, additionally enter Exit to terminate.\nEnter: ");
        String type = sc.next();

        double credit,debit;

        boolean flag = true;

        boolean choice = true;

        while(flag == true)
        {
            switch(type)
            {
                case("Savings"):
                {
                    savingsAccount save = new savingsAccount();
                    save.initializeSavingAccount(name,accnum,balance);
                    while(choice == true)
                    {
                        System.out.println("Enter the amount to be Deposited: ");
                        credit = sc.nextDouble();
                        save.deposit(credit);
                        System.out.println("Enter the amount to be Withdrawn: ");
                        debit = sc.nextDouble();
                        save.withdraw(debit);

                        System.out.println("Enter 'true' if you want to deposit/Withdraw more; else enter 'false': ");
                        choice = sc.nextBoolean();
                        
                        if(choice == false)
                        {
                            break;
                        }
                    }    
                    save.computeInterest();
                    save.displayBalance();
                    System.exit(0);
                }
                case("Current"):
                {
                    currentAccount current = new currentAccount();
                    current.initializeCurrentAccount(name,accnum,balance);
                    while(choice == true)
                    {
                        System.out.println("Enter the amount to be Deposited: ");
                        credit = sc.nextDouble();
                        current.deposit(credit);
                        System.out.println("Enter the amount to be Withdrawn: ");
                        debit = sc.nextDouble();
                        current.withdraw(debit);

                        System.out.println("Enter 'true' if you want to deposit/Withdraw more; else enter 'false': ");
                        choice = sc.nextBoolean();
                        
                        if(choice == false)
                        {
                            break;
                        }
                    }
                    current.displayBalance();
                    System.exit(0);
                }
                case ("Exit"):
                System.exit(0);          
                default:
                System.out.println("Invalid Input.");
                type = sc.next();
            }
        }
        sc.close();
    }   
}