package moduuli8_1.task2;

/**
 * StringManipulator luokka
 * Tarjoaa erilaisia stringin käsittelymenetelmiä
 */

public class StringManipulator {

    /**
     * @param str1 a string
     * @param str2 another string
     * @return a string that is the concatenation of str1 and str2, with a space in between
     */

    public String concatenateWithSpace(String str1, String str2) {
        return str1 +  str2;
    }

    /**
     * Palauttaa stringin pituuden
     * @param str String jonka pituus halutaan
     * @return Stringin pituus
     */

    public int findLength(String str) {
        return str.length();
    }

    /**
     * @param str a string
     * @return the string in uppercase
     */

    public String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

        /**
        * @param str a string
        * @return the string in lowercase
        */

    public String convertToLowerCase(String str) {
        return str.toLowerCase();

    }


    /**
     * Tarkistaa löytyykö substring päälangstringista
     * @param str Päälangstring
     * @param subStr Etsittävä substring
     * @return true jos substring löytyy, false muuten
     */

    public boolean containsSubstring(String str, String subStr) {
        return str.contains(subStr);
    }
}
