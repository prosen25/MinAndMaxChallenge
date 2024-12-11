import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("This minimum and maximum value identifier from user input.");
        double minNumber = 0;
        double maxNumber = 0;
        Scanner scanner = new Scanner(System.in);

        // Create a infinite loop until user input a non-numeric character to exit
        while (true) {
            System.out.println("Enter a number or any other character to exit.");
            String userInput = scanner.nextLine();
            try {
                double number = Double.parseDouble(userInput);

                // If it's the first value, set up both min and max with it
                if (minNumber == 0 && maxNumber == 0 && number != 0) {
                    minNumber = number;
                    maxNumber = number;
                }

                // If the input is lesser than previous minimum number then replace it
                if (number < minNumber) {
                    minNumber = number;
                }

                // If the input is greater than the previous maximum number then replace it
                if (number > maxNumber) {
                    maxNumber = number;
                }

            } catch (Exception ex) {
                System.out.println("You selected to quit");
                break;
            }
        }

        System.out.println("The minimum number you entered is " + minNumber);
        System.out.println("The maximum number you entered is " + maxNumber);
    }
}