import java.util.Scanner;

class ReverseString{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        StringBuilder s = new StringBuilder();
        for(int i = str.toCharArray().length - 1; i >= 0; i--){
            s.append(str.toCharArray()[i]);
        }
        return s.toString();
    }
}