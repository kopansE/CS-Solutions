public class Palindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases for Palindrome
        System.out.println("Testing Palindrome:");
        System.out.println("racecar is palindrome: " + isPalindrome("racecar")); // true
        System.out.println("hello is palindrome: " + isPalindrome("hello"));     // false
        System.out.println("madam is palindrome: " + isPalindrome("madam"));     // true
        System.out.println("a is palindrome: " + isPalindrome("a"));             // true
        System.out.println("ab is palindrome: " + isPalindrome("ab"));           // false
    }
}
