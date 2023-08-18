import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class calculator
{
    Scanner sc = new Scanner(System.in);
    double result = 0;
        public static void main(String arg[]) throws IOException
    {
        System.out.println("Welcome ! this is a demo calculator.");
        
        calculator cal = new calculator();
        
        cal.result = cal.first();
        System.out.println("enter from within these functions: *,/,-,+,%,^,root");
        String s = cal.sc.next();
        System.out.println(cal.arith_calc(s));
        }
    
    public float first()
    {
        System.out.println("enter first value:");
        float f = sc.nextFloat();
        return f;
    }
    public double arith_calc(String s)
    {
        if(s.equals("="))
        {
            return result;   
        }
        float n = 0;
        if(s.equals("/") || s.equals("*") || s.equals("-") || s.equals("+") || s.equals("%"))
        {
            System.out.println("enter value:");
        
            n = sc.nextFloat();
        }
        switch(s)
            {
                case "+":
                    result = result + n;
                    System.out.println("Enter from within these functions: *,/,-,+,%,^,root.\nuse = to display final answer.");
                    return arith_calc(sc.next());
                case "-":
                    result = result - n;
                    System.out.println("Enter from within these functions: *,/,-,+,%,^,root.\nuse = to display final answer.");
                    return arith_calc(sc.next());
                case "*":
                    result = result * n;
                    System.out.println("Enter from within these functions: *,/,-,+,%,^,root.\nuse = to display final answer.");
                    return arith_calc(sc.next());
                case "/":
                    result = result / n;
                    System.out.println("Enter from within these functions: *,/,-,+,%,^,root.\nuse = to display final answer.");
                    return arith_calc(sc.next());
                case "%":
                    result = result % n;
                    System.out.println("Enter from within these functions: *,/,-,+,%,^,root.\nuse = to display final answer.");
                    return arith_calc(sc.next());
                case "^":
                    System.out.println("enter exponent.");
                    result = Math.pow(result,sc.nextInt());
                    return arith_calc("=");
                case "root":
                    result = Math.sqrt(result);
                    return arith_calc("=");
                default:
                    System.out.println("error: unknown operator used.");
                    return 0;
            }
    }
}
