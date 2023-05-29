package GroupProjectOOPs;

public class NonRepeating {
    /*
    5. Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'
     */
    public static void main(String[] args) {
        String str="abracadabra";
        for(char i:str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println("The firs non-repeating character is "+i);
                break;
            }

        }
    }
}
