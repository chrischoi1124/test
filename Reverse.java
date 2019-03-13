
/**
 * A guess the password program.
 *
 * @author (Chris Choi)
 * @version (11/20/2018)
 */
public class Reverse
{
    
    public static final String SECRET_PASSWORD = "INCORRECT";
    
    static String obfuscate (String input)
    {
        return input.replace('I', 'X').concat("YES").replace('N', 'B').replace('C', 'S').replace('R', 'F');
    }
    public static void main(String [] args) {
        if (args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <argument>");
            return;
        }
        
        if( args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You win!");
        }
        else
        {
            System.out.println("Your password is incorrect! Try again!");
        }
    }    
}
