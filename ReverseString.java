package GroupProjectOOPs;

public class ReverseString {
    //1. Reverse a String: Write a function to reverse a given string. For
    //example, given the input "Hello", the output should be "olleH".
    public static void main(String[] args) {
        String word = "Hello";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println(reverse);
    }
}
