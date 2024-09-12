import java.util.Scanner;

abstract class Bank
{
    Scanner sc = new Scanner(System.in);
    float balance = 1000;
    abstract void deposit();
    abstract void getBalance();
}
class A extends Bank
{
    void deposit()
    {
        System.out.print("Enter deposit amount: ");
        float n = Float.parseFloat(sc.next());
        balance += n;
    }
    void getBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}
class B extends Bank
{
    void deposit()
    {
        System.out.print("Enter deposit amount: ");
        float n = Float.parseFloat(sc.next());
        balance += n;
    }
    void getBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}
class C extends Bank
{
    void deposit()
    {
        System.out.print("Enter deposit amount: ");
        float n = Float.parseFloat(sc.next());
        balance += n;
    }
    void getBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}
public class Problem1 
{
    public static void main(String arg[]) 
    {
        A obj = new A();
        B obj1 = new B();
        C obj2 = new C();
        obj.deposit();
        obj.getBalance();
        obj1.deposit();
        obj1.getBalance();
        obj2.deposit();
        obj2.getBalance();
    }
}
