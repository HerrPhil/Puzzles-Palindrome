public class Palindrome {
    public static void main(String [] args) {
	    System.out.println("Hello palindrome"); // Hello palindrome
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.println("java Palindrome <input>");
            System.out.println("or");
            System.out.println("java Palindrome -ignore <input>");
            return;
        }
        if (args == null || args.length == 0) { // check for args
            System.out.println("String to check for palindrome is mandatory");
            return;
        }
        String original = args[0];
        String checkForPalindrome = original;
        boolean ignoreCase = args.length == 2;
        if (ignoreCase) {
            if (args[0].toLowerCase().equals("-ignore")) {
                original = args[1];
                checkForPalindrome = original.toLowerCase();
            }
        }
        if (checkForPalindrome.length() == 1) {
            System.out.println("Palindrome of one character");
            return;
        }
        int start = 0;
        int end = checkForPalindrome.length() - 1;
        boolean isPalindrome = true;
        while (isPalindrome) {
            isPalindrome &= checkForPalindrome.charAt(start) == checkForPalindrome.charAt(end);
            // when start equals end - 1 (even number of characters), or
            // when start equals end (odd number of characters)
            // then check is done
            if (start == end - 1  || start == end) {
                break;
            }
            start += 1;
            end -= 1;
        }
        if (isPalindrome) {
            System.out.println(String.format("%s is palindrome", original));
        } else {
            System.out.println(String.format("%s is not palindrome", original));
        }
    }
}
