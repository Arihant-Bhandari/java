// public class Day_4 
// {
//     public static void main(String arg[]) 
//     {
//         Day_4 day = new Day_4();
//     }
//     Day_4()
//     {
//         System.out.println("Object created.");
//     }
// }

import java.util.*;

public class Day_4
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll no.: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();

        System.out.print("Enter Subject name: ");
        String name = sc.next();

        Demo obj = new Demo(rollNo,marks,name);

        obj.showData();

        sc.close();
    }
}
class Demo
{
    int rollNo;
    float marks;
    String name;

    Demo(int rollNo, float marks, String name)
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