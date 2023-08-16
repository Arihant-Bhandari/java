import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class calculator
{
    static Scanner sc = new Scanner(System.in);
    static double result = 0;
    public static int first()
    {
        System.out.println("enter first value:");
        int f = sc.nextInt();
        return f;
    }
    public static double arith_calc(String s)
    {
        if(s.equals("="))
        {
            return result;   
        }
        int n = 0;
        if(s.equals("/") || s.equals("*") || s.equals("-") || s.equals("+") || s.equals("%"))
        {
            System.out.println("enter value:");
        
            n = sc.nextInt();
        }
        switch(s)
            {
                case "+":
                    result = result + n;
                    System.out.println("enter from within these functions: *,/,-,+,%,^,root");
                    return arith_calc(sc.next());
                case "-":
                    result = result - n;
                    System.out.println("enter from within these functions: *,/,-,+,%,^,root");
                    return arith_calc(sc.next());
                case "*":
                    result = result * n;
                    System.out.println("enter from within these functions: *,/,-,+,%,^,root");
                    return arith_calc(sc.next());
                case "/":
                    result = result / n;
                    System.out.println("enter from within these functions: *,/,-,+,%,^,root");
                    return arith_calc(sc.next());
                case "%":
                    result = result % n;
                    System.out.println("enter from within these functions: *,/,-,+,%,^,root");
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
    public static void main(String arg[]) throws IOException
    {
        System.out.println("Welcome ! this is a demo calculator.");
        
        result = first();
        System.out.println("enter from within these functions: *,/,-,+,%,^,root");
        String s = sc.next();
        System.out.println(arith_calc(s));
        }
    }

