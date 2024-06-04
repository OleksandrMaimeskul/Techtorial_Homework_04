import java.util.Scanner;

public class TASK7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First String value: ");
        String firstValue = scanner.nextLine();
        System.out.println("Please enter Second String value: ");
        String secondValue = scanner.nextLine();

        if (firstValue.contains(secondValue) || secondValue.contains(firstValue)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
