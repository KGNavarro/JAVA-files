import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
    double total, tip;
        System.out.println("Please enter your total: ");
    Scanner input = new Scanner(System.in);
    total = input.nextDouble();
    if (total < 30.0){
        total = total + 5;
        System.out.print("Your estimated tip is $5. ");
        System.out.println("Your total amount is " + total);
    }
    else{
        tip = total * 0.15;
        total = total + tip;
        System.out.print("Your estimated tip is " + tip +". ");
        System.out.println("Your total amount is " + total);
    }
    }
    
}
