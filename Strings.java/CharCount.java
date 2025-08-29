import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Input target character
        System.out.print("Enter the target character: ");
        char target = sc.nextLine().charAt(0);

        int count = 0;

        // Loop through the string and count occurrences
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Total occurrences of '" + target + "' = " + count);

        sc.close();
    }
}

