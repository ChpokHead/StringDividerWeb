package com.chpok.stringdividerweb.util;

public class StringDivider {
    /**
     * Divides string in particular parts
     * @param inputStr string to divide
     * @param numOfLettersNeeded length of divided parts
     * @return string that contains \n at the end of each divided part
     */
    public static String divideByNumOfLetters(String inputStr, int numOfLettersNeeded) {
        int inStrLen = inputStr.length();

        //Index of the last character in a divided part
        int lastPartIndex = 0;

        //StringBuilder is needed to concatenate divided parts in output string
        StringBuilder sb = new StringBuilder();

        //Checking if the given parts size is correct
        if (numOfLettersNeeded > inStrLen || numOfLettersNeeded < 1)
            return inputStr;

        for (int i = 0; i < inStrLen; i++) {

            //When we reached required characters number
            if ((i + 1) % numOfLettersNeeded == 0) {
                //Divide string and append that part to the builder
                sb.append(inputStr.substring(lastPartIndex, i + 1) + "\n");
                lastPartIndex = i + 1;
            }
        }

        //Checking the end of the string
        if (lastPartIndex != inStrLen)
            sb.append(inputStr.substring(lastPartIndex));

        return sb.toString();
    }
}
