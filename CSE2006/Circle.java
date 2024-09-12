import java.util.Scanner;
import java.lang.Math;

public class Circle 
{
    float radius;
    public static void main(String arg[]) 
    {
        Circle circle = new Circle();

        System.out.println(circle.parameter(circle.radius));
        System.out.println(circle.area(circle.radius));
    }  
    Circle()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        float r = sc.nextFloat();

        radius = r;

        sc.close();
    }  
    public double area(float radius)
    {
        return Math.pow(radius, 2)*Math.PI;
    }
    public double parameter(float radius)
    {
        return 2*Math.PI*radius;
    }
}