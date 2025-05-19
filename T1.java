import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter minutes: ");
        int totalMinutes = scanner.nextInt();

        // Convert minutes to hours and minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Display result
        System.out.println(totalMinutes + " minutes is " + hours + " hours and " + minutes + " minutes.");

        scanner.close();
    }
}
