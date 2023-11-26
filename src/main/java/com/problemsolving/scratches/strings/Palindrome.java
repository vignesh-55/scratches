import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String input){
        input = input.replaceAll("[^a-zA-Z]","").toLowerCase();
        int i = 0, j = input.length()-1;
        while(i<j){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}