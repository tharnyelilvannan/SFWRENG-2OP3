package question3;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 07, 2024
 * Purpose: Processed strings.
 */

public class App {
    public static void main(String[] args) {
        String myString = "hello!   my name is Tharny?";
        StringCleaner c = new StringCleaner(myString);
        System.out.println(c.getString());
    }
}

class StringCleaner {

    String strArray;
    
    StringCleaner(String str) {
        strArray = removePunctuation(str);
        strArray = convertToLowercase(strArray);
        strArray = removeSpaces(strArray);
    } // end of StringCleaner method

    private String removePunctuation(String str) {
        str = str.replaceAll("[':.,|///;?!@#$%^&*()~]", "");
        return str;
    } // end of remove method

    private String convertToLowercase(String str) {
        str = str.toLowerCase();
        return str;
    } // end of convert method

    private String removeSpaces(String str) {
        str = str.replaceAll("\s\s+", "\s");
        str = str.replaceAll("\s{1,}$", "");
        str = str.replaceAll("^\s{1,}", "");

        return str;
    } // end of removeSpaces method

    public String getString() {
        return strArray;
    } // end of getString method
} // end of StringCleaner class