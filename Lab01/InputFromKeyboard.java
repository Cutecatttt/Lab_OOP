import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String strName = scanner.nextLine();
        System.out.println("How old are you?");
        int iAge = scanner.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = scanner.nextDouble();
        scanner.close();
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");
    }
}