import java.util.*;

public class Day_3 
{
    public static void main(String arg[]) 
    {
        StudentDemo obj = new StudentDemo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll no.: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();

        System.out.print("Enter Subject name: ");
        String name = sc.next();

        obj.setData(rollNo, marks, name);
        obj.showData();

        sc.close();
    }
}
class StudentDemo
{
    int rollNo;
    float marks;
    String name;

    void setData(int rollNo, float marks, String name)
    {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }
    void showData()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + name);
    }
}