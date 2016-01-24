/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 01.03.14
 * Time: 00:59
 * To change this template use File | Settings | File Templates.
 */
public class GuessTheNumber
{
    public static void main (String[] args)
    {
        int number = (int) (Math.random()*5 +1);

        System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
        int guess = new java.util.Scanner(System.in).nextInt();

        if (number == guess)
            System.out.println("Super getippt!");

        else
            System.out.println("Tja, stimmt nicht, habe mir " + number + " gedacht!");


    }

}

// finished 13.03.2014