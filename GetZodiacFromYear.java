//Kevin Navarro 108301072
package chinesezodiac;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year to know your zodiac sign : ");
        try {
            int year = input.nextInt();
            String[] signs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
            System.out.println("Your sign is " + signs[year%12]);
        }catch (InputMismatchException ex){
            System.out.println("That is not a valid year");
        }
    }
    
}
