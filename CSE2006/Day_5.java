class MyThread extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        for(int i = 0; i<10; i++)
        System.out.println(name + " " + i);
    }
}
public class Day_5 
{
    public static void main(String arg[]) 
    {
        MyThread obj1 = new MyThread();
        MyThread obj2 = new MyThread();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.setName("First");
        t2.setName("Second");
    }
}
