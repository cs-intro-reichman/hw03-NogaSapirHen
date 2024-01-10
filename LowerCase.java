/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String fixed = "";
        for ( int i = 0; i < s.length (); i ++) {
            // upper-case letter
            char temp = s.charAt(i);
            if (temp > 64 && temp < 91 ) {
                temp = (char) (temp+32);
            }
             fixed += temp;
        }
        return fixed;
    }
}