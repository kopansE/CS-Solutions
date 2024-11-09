public class AlmostPalindrome {

    public static boolean isAlmostPalindrome(String s, double percentage) {
        int left = 0;
        int right = s.length() - 1;
        int mismatches = 0;

        int allowedMismatches = (int)Math.floor( s.length() * (1-percentage));
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                mismatches+=2;
                if (mismatches > allowedMismatches) {
                    return false;
                }
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Testing AlmostPalindrome with percentage tolerance:");
        System.out.println("racecar is 100% palindrome: " + isAlmostPalindrome("racecar", 1.0));   // true
        System.out.println("racefar is 71% palindrome: " + isAlmostPalindrome("racefar", 0.71));   // true
        System.out.println("racefar is 72% palindrome: " + isAlmostPalindrome("racefar", 0.72));   // false
        System.out.println("hello is 40% palindrome: " + isAlmostPalindrome("hello", 0.4));       // false
        System.out.println("abca is 75% palindrome: " + isAlmostPalindrome("abca", 0.75));         // false
        System.out.println("abcdef is 50% palindrome: " + isAlmostPalindrome("abcdef", 0.5));     // false
    }
}
