abstract class Abs
{
    Abs()
    {
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void n_method()
    {
        System.out.println("This is a normal method of abstract class");
    }
}
class Subclass extends Abs
{
    void a_method()
    {
        System.out.println("This is abstract method");
    }
}
public class Problem2 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Reg. no.: 22BCE11373");

        Subclass sub = new Subclass();
        sub.a_method();
        sub.n_method();
    }
}
