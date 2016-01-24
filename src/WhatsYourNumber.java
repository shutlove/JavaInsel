/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 25.02.14
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class WhatsYourNumber
{
    public static void main (String[] args)
    {
        int number = (int) (Math.random()*5 +1);

        System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
        int guess = new java.util.Scanner(System.in).nextInt();

        if (number == guess)
                System.out.println("Super getippt!");

        else
            System.out.println("Starte das Programm noch mal und rate erneut!");

        System.out.println("Die Zahl ist " + number + ".");
    }
}


//finished 13.03.2014