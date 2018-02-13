import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String userInput;
        long value = 0;
        long decimal = 0;
        double x = 0;

        System.out.println("Enter a hexadecimal number: ");
        userInput = sc.next();
        userInput = userInput.toLowerCase();


        //This is a comment added for Lab 5
        for (int i = userInput.length() - 1; i < userInput.length() && i >= 0; i--) {
            if ((int) userInput.charAt(i) <= 57) {
                value = (int) userInput.charAt(i) - 48;
                decimal += (long) Math.pow(16, x) * value;
                x++;
            } else if ((int) userInput.charAt(i) >= 97 && (int) userInput.charAt(i) <= 102) {
                value = (int) userInput.charAt(i) - 87;
                decimal += (long) Math.pow(16, x) * value;
                x++;
            } else if ((int) userInput.charAt(i) == 120) {
                i = -1;
            }
        }
        System.out.println("Your number is " + decimal + " in decimal");
    }
}
