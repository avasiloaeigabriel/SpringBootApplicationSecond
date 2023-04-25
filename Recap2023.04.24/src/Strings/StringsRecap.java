package Strings;

import java.util.zip.CheckedOutputStream;

public class StringsRecap {
    private String firstName = "Gabriel";
    private String lastName = "Avasiloaei";

    public void getNameLength() {
        System.out.println("The length of the given string is: " + firstName.length());
    }

    public void concatenateTwoStrings() {
        System.out.println("Concatenation of the two given Strings is: " + firstName + " " + lastName);
    }

    public void stringContainingSpecificLetter() {
        firstName = firstName.toLowerCase();
        if (firstName.contains("g")) {
            System.out.println("The given name contains \"g\"");
        } else {
            System.out.println("The given name does not contain the letter \"g\"");
        }
    }

    public void firstAndLastCharacter() {
        firstName = firstName.toUpperCase();
        System.out.println("First letter is: " + firstName.charAt(0) + " and the last letter is: " + firstName.charAt((firstName.length() - 1)));
    }

    public void printEveryCharacterExceptTheFirst() {
        char[] letters = firstName.toCharArray();

        for (int index = 1; index < letters.length; index++) {
            System.out.println(letters[index]);
        }
    }

    public void printEveryCharacter() {
        char[] letters = firstName.toCharArray();

        for (int index = 0; index < letters.length; index++) {
            System.out.println(letters[index]);
        }
    }
}
