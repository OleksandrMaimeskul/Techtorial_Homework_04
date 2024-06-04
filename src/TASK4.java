public class TASK4 {
    public static void main(String[] args) {
        int a = 5;  // Initial value for a
        int b = 6;  // Initial value for b

// Calculate the total step by step
        int total = a++  // a = 5, a becomes 6 after this
                + ++a // a becomes 7, then used as 7
                + --b // b becomes 5, then used as 5
                + ++b // b becomes 6, then used as 6
                + b   // b is used as 6
                + ++a // a becomes 8, then used as 8
                + ++b // b becomes 7, then used as 7
                - --b // b becomes 6, then used as 6
                + a;  // a is used as 8

        System.out.println(a);     // a --> 8
        System.out.println(b);     // b --> 6
        System.out.println(total); // total --> 46
    }
}
