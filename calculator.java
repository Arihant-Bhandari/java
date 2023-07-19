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
        
        System.out.println("enter value:");
        
        int n = sc.nextInt();
        
        switch(s)
            {
                case "+":
                    result = result + n;
                    System.out.println("enter function:");
                    return arith_calc(sc.next());
                case "-":
                    result = result - n;
                    System.out.println("enter function:");
                    return arith_calc(sc.next());
                case "*":
                    result = result * n;
                    System.out.println("enter function:");
                    return arith_calc(sc.next());
                case "/":
                    result = result / n;
                    System.out.println("enter function:");
                    return arith_calc(sc.next());
                case "%":
                    result = result % n;
                    System.out.println("enter function:");
                    return arith_calc(sc.next());
                case "^":
                    System.out.println("enter exponent.");
                    Math.pow(n,sc.nextInt());
                    System.out.println("enter function:");
                    return arith_calc(sc.next());
                case "root":
                    Math.sqrt(n);
                    System.out.println("enter function:");
                    return arith_calc(sc.next());
                default:
                    System.out.println("error: unknown operator used.");
                    return 0;
            }
    }
    public static void main(String arg[]) throws IOException
    {
        System.out.println("Welcome ! this is a demo calculator.");
        
        result = first();
        System.out.println("enter function:");
        String s = sc.next();
        System.out.println(arith_calc(s));
        }
    }

