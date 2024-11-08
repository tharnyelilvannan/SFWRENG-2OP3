package question4;

import java.util.*;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 08, 2024
 * Purpose: Analyzes strings.
 */

public class App {
    public static void main(String[] args) {
        
        String myString = "hello!   my name name is Tharny?";
        StringAnalyzer c = new StringAnalyzer(myString);
        System.out.println(c.getWordFrequency()); 
           
    }
}

class StringCleaner {

    String strArray;
    
    StringCleaner(String str) {

        strArray = removePunctuation(str);
        strArray = convertToLowercase(strArray);
        strArray = removeSpaces(strArray);

    } // end of StringCleaner method

    protected final String removePunctuation(String str) {

        str = str.replaceAll("[':.,|///;?!@#$%^&*()~]", "");
        return str;

    } // end of remove method

    protected final String convertToLowercase(String str) {

        str = str.toLowerCase();
        return str;

    } // end of convert method

    protected final String removeSpaces(String str) {

        str = str.replaceAll("\s\s+", "\s");
        str = str.replaceAll("\s{1,}$", "");
        str = str.replaceAll("^\s{1,}", "");

        return str;

    } // end of removeSpaces method

    public String getString() {

        return strArray;

    } // end of getString method

} // end of StringCleaner class

class StringAnalyzer extends StringCleaner {

    Map<String, Integer> frequency = new HashMap<>();
    String[] individualWords;
    
    StringAnalyzer(String str) {

        super(str);
        wordFrequency();

    } // end of StringAnalyzer method

    protected final void wordFrequency() {

        individualWords = strArray.split("\s");

        int i;
        int y;
        int numValues = 0;

        for (i = 0; i < individualWords.length; i++) {

			if (!frequency.containsKey(individualWords[i])) {

                for (y = 0; y < individualWords.length; y++) {

                    if (individualWords[y].equals(individualWords[i])) {

                        numValues++;

                    } // end of if 

                } // end of for loop

                frequency.put(individualWords[i], numValues);
                numValues = 0;

            } // end of if

		} // end of for loop

    } // end of wordFrequency method

    public Map<String, Integer> getWordFrequency() {

        return frequency;

    } // end of getWordFrequency method

} // end of StringAnalyzer class