package GroupProjectOOPs;

import java.util.Arrays;

public class Anagrams {
    /*
    4. Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        String w1="Cat";
        String w2="Act";
        w1=w1.toLowerCase();
        w2=w2.toLowerCase();
        if (w1.length() == w2.length()){
            char[] charArray1=w1.toCharArray();
            char[] charArray2=w2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean isAngram=Arrays.equals(charArray1, charArray2);
            if(isAngram){
                System.out.println(w1+" and "+w2+" are Anagrams");
            }else{
                System.out.println("The words are not Anagrams");
            }
            }
        }

    }

