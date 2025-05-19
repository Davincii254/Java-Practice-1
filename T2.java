import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a 10-digit phone number starting with 1: ");
        long phoneNumber = scanner.nextLong();

        // Extract parts
        long areaCode = phoneNumber / 10000000; // first 3 digits
        long prefix = (phoneNumber / 10000) % 1000; // middle 3 digits
        long lineNumber = phoneNumber % 10000; // last 4 digits

        // Display result with zero-padding for line number
        System.out.printf("(%03d) %03d-%04d\n", areaCode, prefix, lineNumber);

        scanner.close();
    }
}
