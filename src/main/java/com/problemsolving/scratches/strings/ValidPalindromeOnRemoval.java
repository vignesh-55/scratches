package com.problemsolving.scratches.strings;

class ValidPalindromeOnRemoval{
    public static void main(String[] args) {
        String s = "abccab";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int low = 0, high = s.length()-1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return isValidPalindrome(s, low+1, high) || isValidPalindrome(s, low, high-1);
            }
            low++;
            high--;
        }
        return true;
    }

    private static boolean isValidPalindrome(String s, int i, int high) {
        while(i < high){
            if(s.charAt(i) != s.charAt(high)){
                return false;
            }
            i++;
            high--;
        }
        return true;
    }
}