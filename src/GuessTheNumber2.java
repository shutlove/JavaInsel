/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 01.03.14
 * Time: 01:05
 * To change this template use File | Settings | File Templates.
 */
public class GuessTheNumber2
{
    public static void main (String[] args)
    {
        int number = (int) (Math.random()*5 +1);

        System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
        int guess = new java.util.Scanner(System.in).nextInt();

        if (number == guess)
            System.out.println("Super getippt!");

        else if (number > guess)
            System.out.println("Ne, meine Zahl ist größer, als deine.");

        else if (number < guess)
            System.out.println("Ne, meine Zahl ist kleiner, als deine.");

    }

}


//finished 13.03.2014