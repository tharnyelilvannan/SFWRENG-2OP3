package question5;

import java.util.*;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 08, 2024
 * Purpose: Analyzes text.
 */

public class App {

    public static void main(String[] args) {
        
        String myString = "hello    my name is Tharny?";
        TextAnalyzer c = new TextAnalyzer(myString);
        System.out.println(c.getWordLength()); 
        System.out.println(c.getAlphabeticalOrder());

    } // end of main method

} // end of App class

class StringCleaner {

    String newStr;
    
    StringCleaner(String str) {

        newStr = removePunctuation(str);
        newStr = convertToLowercase(newStr);
        newStr = removeSpaces(newStr);

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

        return newStr;

    } // end of getString method

} // end of StringCleaner class

class StringAnalyzer extends StringCleaner {

    Map<String, Integer> frequency = new HashMap<>();
    String[] individualWords;
    int longest = 0;
    String longestWord = "";
    String originalString;
    boolean isPalindrome;
    
    StringAnalyzer(String str) {
        super(str);
        originalString = str;
        wordFrequency();
        longestWord();
        palindrome();

    } // end of StringAnalyzer method

    protected final void wordFrequency() {

        individualWords = newStr.split("\s");

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

    protected final void longestWord() {

        try {

            if (originalString.isEmpty()) {

                throw new Exception ("Empty String");

            }

            int i;

            for (i = 0; i < individualWords.length; i++) {

                if (individualWords[i].length() > longest) {

                    longest = individualWords[i].length();
                    longestWord = individualWords[i];

                } // end of if

            } // end of for loop

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } // end of try/catch statement

    } // end of longestWord method

    public String getLongestWord() {

        return longestWord;

    } // end of getLongestWord method

    protected final void palindrome() {
        
        try {

            int lengthStr = individualWords.length;
            int i;
            int loops = 1;

            if (lengthStr == 0) {

                throw new ArithmeticException("Empty String.");

            } // end of if

            if (lengthStr % 2 == 0) {

                for (i = 0; i <= (lengthStr/2); i++) {

                    if (individualWords[i].equals(individualWords[(lengthStr - loops)])) {

                        loops++;

                    }
                    else {

                        isPalindrome = false;
                        break;
            
                    }

                    isPalindrome = true;

                } // end of for loop

            }
            else if (lengthStr % 2 != 0) {

                for (i = 0; i < (lengthStr/2); i++) {

                    if (individualWords[i].equals(individualWords[(lengthStr - loops)])) {

                        loops++;

                    }
                    else {

                        isPalindrome = false;
                        break;
            
                    }

                    isPalindrome = true;

                } // end of for loop

            }
            else {

                throw new Exception("Error.");

            } // end of if/else statement

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } // end of try/catch statement

    } // end of palindrome method

    public boolean getPalindrome() {

        return isPalindrome;

    } // end of getPalindrome method

} // end of StringAnalyzer class

class TextAnalyzer extends StringAnalyzer {

    double averageLength;
    TreeMap<String, Integer> alphabeticalOrder = new TreeMap<>();


    TextAnalyzer(String str) {

        super(str);
        wordLength();
        alphabeticalOrder();

    } // end of TextAnalyzer method

    protected final void wordLength() {

        int i;
        double total = 0.0;

        for (i=0; i < individualWords.length; i++) {

            total = total + individualWords[i].length();

        } // end of for

        averageLength = total / individualWords.length;

    } // end of wordLength method

    public double getWordLength() {

        return averageLength;

    } // end of getWordLength method

    protected final void alphabeticalOrder() {

        individualWords = newStr.split("\s");

        int i;

        for (i = 0; i < individualWords.length; i++) {

			if (!alphabeticalOrder.containsKey(individualWords[i])) {

                alphabeticalOrder.put(individualWords[i], 0);
                
            } // end of if

		} // end of for loop

    } // end of alphabeticalOrder method

    public Set<String> getAlphabeticalOrder() {

        return alphabeticalOrder.keySet();

    } // end of getAlphabeticalOrder method

} // end of TextAnalyzer class