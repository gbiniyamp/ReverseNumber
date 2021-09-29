import java.util.Scanner;

public class ReverseNumber {

    public static void main(String args[]) {
        int userInput;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput= keybd.nextInt();

        for (int i = userInput; userInput > 0; userInput--) {
            userInput = userInput--;
            System.out.println(userInput);
        }
        // use for loop
        System.out.println(userInput);
    }
}
