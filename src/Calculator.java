/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 12.03.14
 * Time: 23:15
 * To change this template use File | Settings | File Templates.
 */


public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("Please enter the X");
        double x = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Please enter the operator: +, -, * or /");
        char operator = new java.util.Scanner(System.in).nextLine().charAt(0);
        System.out.println("Please enter the Y");
        double y = new java.util.Scanner(System.in).nextDouble();

        switch (operator)
        {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            default:
                System.err.println("Unbekannter operator: " + "'" + operator + "'");
        }
    }

}

// finished 12.03.2014