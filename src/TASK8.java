import java.util.Scanner;

public class TASK8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First String value: ");
        String firstValue = scanner.nextLine();
        int length = firstValue.length();
        System.out.println("Please enter Second String value: ");
        String secondValue = scanner.nextLine();
        String lastTwoChars = firstValue.toLowerCase().substring(length - 2);

        if (secondValue.toLowerCase().startsWith(lastTwoChars)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

