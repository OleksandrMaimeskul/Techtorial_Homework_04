import java.util.Scanner;

public class TASK6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string with multiple words: ");
        String str = scanner.nextLine();

        int firstSpace = str.indexOf(' ');
        int secondSpace = str.indexOf(' ', firstSpace + 1);

        char firstLetter = str.charAt(0);
        char firstLetter2 = str.charAt(firstSpace + 1);
        char firstLetter3 = str.charAt(secondSpace + 1);

        System.out.println("" + firstLetter + firstLetter2 + firstLetter3);

        char lastLetter = str.charAt(firstSpace - 1);
        char lastLetter2 = str.charAt(secondSpace - 1);
        char lastLetter3 = str.charAt(str.length() - 1);

        System.out.println("" + lastLetter+ lastLetter2+lastLetter3);

        int firstWordLength = firstSpace;
        int secondWordLength = secondSpace-firstSpace-1;
        int thirdWordLength = str.length()-secondWordLength-1-firstWordLength-1;

        System.out.println(firstWordLength);
        System.out.println(secondWordLength);
        System.out.println(thirdWordLength);

    }
}