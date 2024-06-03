import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name of the song: ");
        String songName = scanner.nextLine().toUpperCase();
        String lowerCase = songName.toLowerCase();
        int length = songName.length();
        char firstLetter = songName.charAt(0);;
        char lastLetter = songName.charAt(length-1);
        int letterK = songName.indexOf('k');
        char thirdLetter = songName.charAt(3);
        System.out.println("Your song in UPPER cases: " + songName);
        System.out.println("Your song in lower cases: " + lowerCase);
        System.out.println("First char of given song name: " + firstLetter);
        System.out.println("Last char of given song name: " + lastLetter);
        System.out.println("Length of given song name: " + length);
        System.out.println("Index 'k' of given song name: " + letterK);
        System.out.println("Letter 3 of given song name: " + thirdLetter);



    }
}
