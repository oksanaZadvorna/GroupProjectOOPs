package GroupProjectOOPs;

public class Palindrome {
    /*
    2. Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
     */
    public static boolean isPalindrome (String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        String reverse=rev.toString();
        if(str.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
//test palindrome:
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("dad"));
        System.out.println(isPalindrome("boy"));
    }
}
