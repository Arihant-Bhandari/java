class threader extends Thread
{
    public void run()
    {
        System.out.println("Thread created: Running.");
    }
}
public class Threading 
{
    public static void main(String arg[]) 
    {
        threader obj = new threader();
        Thread t = new Thread(obj);
        t.start();
    }
}
