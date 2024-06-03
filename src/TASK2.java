import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter required info in UPPER CASE");
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your Full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Please enter your State Code: ");
        String stateCode = scanner.nextLine();
        int stateCodeLength = stateCode.length();

        System.out.println("Please enter your City: ");
        String city = scanner.nextLine();

        System.out.println("Please enter your Gender ( F, M): ");
        String gender = scanner.nextLine();
        int length = fullName.length();
        boolean youCanVote = age >= 18 && fullName.charAt(0) == 'A' && fullName.charAt(length - 1) == 'V' &&
                stateCode.charAt(0) == 'I' && stateCode.charAt(stateCodeLength - 1) == 'L' &&
                city.length() <= 10 && gender.equals("M");
        if (youCanVote == true) {
            System.out.println("You can vote! " + youCanVote);
        } else {
            System.out.println("You cannot vote!");
        }
    }
}
