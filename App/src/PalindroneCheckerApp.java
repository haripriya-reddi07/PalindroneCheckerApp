 UC2-HardCodePalindrone

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrone = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrone = false;
                break;
            }
        }
        if (isPalindrone) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }



    }
}

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrone Checker App management system");
    }


}

