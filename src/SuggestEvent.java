import java.util.Scanner;

public class SuggestEvent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter heat value..:");
        int heat = scanner.nextInt();

        String suggestedEvent = (heat <= 5) ? "Ski"
                : (heat > 5 && heat <= 15) ? "Cinema"
                : (heat > 15 && heat <= 25) ? "Picnic"
                : "Swimming";

        System.out.println("Suggested Event :" + suggestedEvent);
    }
}
