import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter random word: ");
        String randomWord = scanner.nextLine();
        System.out.println("Please enter length of word : ");
        int numberOfLetters = scanner.nextInt();
        scanner.nextLine();
        int length = randomWord.length();
        boolean rightOrWrong = numberOfLetters == length;

        if (rightOrWrong == true) {
            System.out.println("You entered " + rightOrWrong + " length.");
        } else if (rightOrWrong==false){
            System.out.println("Wrong!Correct length is: " + length);
        }else{
            System.out.println("Wrong number!");
        }
        System.out.println("Please enter a letter that you want to know an index of: ");
        char indexOf = scanner.nextLine().charAt(0);

        int indexNumber = randomWord.indexOf(indexOf);
        System.out.println("index of entered letter is: " + indexNumber);

    }
}
