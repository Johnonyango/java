import java.util.Scanner;

public class WeiredNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        if (n <= 100) {
            if (n >= 6 && n <= 20) {
                if ((n % 2 != 0))
                    System.out.println("Not Weird");
                else if (n >= 6 && n <= 20)
                    System.out.println("Not Weired");
                else System.out.println("Weired");

            }
        }
    }
}