import java.util.Scanner;

public class TASK5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three String values: ");
        System.out.println("Input-1: ");
        String firstStrings = scanner.nextLine();
        int length = firstStrings.length();
        char firstChar = firstStrings.charAt(0);
        char lastChar = firstStrings.charAt(length-1);

        System.out.println("Input-2: ");
        String secondStrings = scanner.nextLine();
        int length1 = secondStrings.length();
        char firstChar1 = secondStrings.charAt(0);
        char lastChar1 = secondStrings.charAt(length1-1);

        System.out.println("Input-3: ");
        String thirdStrings = scanner.nextLine();
        int length2 = thirdStrings.length();
        char firstChar2 = thirdStrings.charAt(0);
        char lastChar2 = thirdStrings.charAt(length2-1);

        boolean equals = (firstStrings.length()==secondStrings.length()) &&
                (secondStrings.length()==thirdStrings.length());
        System.out.println("" +firstChar+firstChar1+firstChar2);
        System.out.println("" +lastChar+lastChar1+lastChar2);
        System.out.println(equals + " (since each string length is not equal to each other)");

    }
}
