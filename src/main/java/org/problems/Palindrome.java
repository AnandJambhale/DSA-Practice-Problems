package org.problems;

public class Palindrome {

    /*Que: To find palindrome from string having maxiumum length*/

    private static String palindromeString = "";
    private static void findLongestPalindrome(String str){
        if (str.isEmpty()) {
            palindromeString = "";
        }
        for (int i=0;i<str.length();i++){
            for (int j=str.length();j>0;j--){
                if (j>i && isPalindrome(str.substring(i,j)) && palindromeString.length()<str.substring(i,j).length()){
                    palindromeString = str.substring(i,j);
                }
            }
        }
    }
    private static Boolean isPalindrome(String str){
        String reversed = reverseString(str);
        if (str.length()>2 && str.equals(reversed)){
            return true;
        }
        return false;
    }
    private static String reverseString(String str){
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        findLongestPalindrome("abracecar");
        System.out.println(palindromeString);
    }
}
